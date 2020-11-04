package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.*;

public class FileAnalyzeUtil {

    public static List<String> listString(String path, String condition) {
        String string = "";
        List<String> list = new ArrayList<>();
        String lastWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                switch (condition) {
                    case "all":
                        list.add(string);
                    break;
                    case "firstVowel":
                        if (string.matches("^[aeiouyAEIOUY].*"))
                            list.add(string);
                    break;
                    case "lastChar":
                        if (!lastWord.equals("")) {
                            if (lastWord.charAt(lastWord.length() - 1) == string.charAt(0)) {
                                list.add(lastWord);
                            }
                        }
                        lastWord = string;
                    break;
                    case "numbers":
                        list.add(numbers(string));
                    break;
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static String numbers(String string) {
        List<String> list = Arrays.asList(string.split(" "));
        List<Integer> numbersList = new ArrayList<>();
        for (String str : list) {
            numbersList.add(Integer.parseInt(str));
        }
        List<List<Integer>> listOfNumbersList = new ArrayList<>();
        int fromIndex = 0;
        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i++) {
                if (numbersList.get(i - 1) != numbersList.get(i) - 1) {
                    listOfNumbersList.add(numbersList.subList(fromIndex, i));
                    fromIndex = i;
                }
            }
            listOfNumbersList.add(numbersList.subList(fromIndex, numbersList.size()));
        } else return list.get(0);
        int size = listOfNumbersList.get(0).size();
        int max = size;
        int index = 0;
        for (int i = 1; i < listOfNumbersList.size(); i++) {
            size = listOfNumbersList.get(i).size();
            if (max < size) {
                max = size;
                index = i;
            }
        }
        String result = "";
        for (Integer num : listOfNumbersList.get(index)) {
            result += num + " ";
        }
        return result.trim();
    }

    public static List<String> listText(String path, String condition) {
        String string = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                text += string + " ";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        switch (condition) {
            case "lettersFrequency":
                Map<Character, Integer> charMap = new TreeMap<>();
                char ch = ' ';
                text = text.replace(" ", "");
                text = text.toLowerCase();
                while (!text.isEmpty()) {
                    ch = text.charAt(0);
                    text = text.substring(1);
                    if (charMap.containsKey(ch)) {
                        charMap.put(ch, charMap.get(ch) + 1);
                    }
                    else charMap.put(ch, 1);
                }
                for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                    list.add(entry.getKey() + "-" + entry.getValue());
                }
            break;
            case "wordsFrequency":
                Map<String, Integer> stringMap = new TreeMap<>();
                String[] wordsList = text.split(" ");
                for (String word : wordsList) {
                    if (stringMap.containsKey(word)) {
                        stringMap.put(word, stringMap.get(word) + 1);
                    }
                    else stringMap.put(word, 1);
                }
                int i = 0;
                for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
                    wordsList[i++] = entry.getValue() + "-" + entry.getKey();
                }
                String[] result = Arrays.copyOf(wordsList, i);
                Arrays.sort(result);
                list = Arrays.asList(result);
            break;
            case "sortNumbers":
                String[] strs = text.split(" ");
                int[] nums = new int[strs.length];
                for (int j = 0; j < strs.length; j++) {
                    nums[j] = Integer.parseInt(strs[j]);
                }
                Arrays.sort(nums);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
                    for (int j = 0; j < strs.length; j++) {
                        strs[j] = "" + nums[j];
                        writer.write(strs[j] + System.lineSeparator());
                    }
                    writer.flush();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                list.addAll(Arrays.asList(strs));
            break;
        }
        return list;
    }


}

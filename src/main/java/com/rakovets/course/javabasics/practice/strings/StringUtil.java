package com.rakovets.course.javabasics.practice.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    private String str = null;

    public StringUtil(String str) {
        this.str = str;
    }

    //Task 1
    public String uniteStrings(String str) {
        return this.str.concat(str);
    }

    //Task 2
    public int getIndex(char ch) {
        return str.indexOf(ch);
    }

    //Task 3
    public boolean isEqual(String str) {
        return this.str.equals(str);
    }

    //Task 4
    public String trimUpperCase() {
        str = str.trim();
        return str.toUpperCase();
    }

    //Task 5
    public String subStringFrom10Max23() {
        str = str.substring(10);
        return str.substring(0, 23);
    }

    //Task 6
    public String changeSmile() {
        return str.replace(":(", ":)");
    }

    //Task 7
    public boolean startsAndEndsWith(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

    //Task 8
    public int numberOfVowels() {
        int num = 0;
        for (char ch: str.toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'u' || ch == 'i' || ch == 'e' || ch == 'y' || ch == 'A' || ch == 'O' || ch == 'U' || ch == 'I' || ch == 'E' || ch == 'Y')
                num++;
        }
        return num;
    }

    //Task 9
    public int numberOfDotsAndCommasAndExclamationMarks() {
        int num = 0;
        for (char ch: str.toCharArray()) {
            if (ch == '.' || ch == ',' || ch == '!')
                num++;
        }
        return num;
    }

    //Task 10
    public boolean isPalyndrome() {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '.' || ch == ',' || ch == '!' || ch == '?' || ch == '\'' || ch == ' ')
                sb.deleteCharAt(i);
        }
        return (sb.toString().equalsIgnoreCase(sb.reverse().toString()));
    }

    //Task 11
    public String[] toArray(int n) {
        if (str.length() % n != 0) return null;
        String[] strArray = new String[str.length() / n];
        int num = 0;
        for (int i = 0; i < str.length(); i = i + n) {
            strArray[num] = str.substring(i, i + n);
            num++;
        }
        return strArray;
    }

    //Task 12
    public int numberOfWords() {
        str = str.trim();
        String[] arr = str.split(" +");
        int num = 0;
        for (String s : arr) {
            if (!s.equals("-")) num++;
        }
        return num;
    }

    //Task 13
    public String fio() {
        str = str.trim();
        String[] arr = str.split(" +");
        String result = "";
        for (String s : arr) {
            result += s.charAt(0) + ".";
        }
        return result.toUpperCase();
    }

    //Task 14
    public String digits() {
        char[] arr = str.toCharArray();
        String result = "";
        for (char ch : arr) {
            if (Character.isDigit(ch))
                result += ch;
        }
        return result;
    }

    //Task 15
    public String noRepeat(String str) {
        String result = "";
        char[] charArr = this.str.toCharArray();
        for (Character ch : charArr) {
            String s = ch.toString();
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(str);
            if (!m.find()) result += s + " ";
        }
        charArr = str.toCharArray();
        for (Character ch : charArr) {
            String s = ch.toString();
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(this.str);
            if (!m.find()) result += s + " ";
        }
        return result.trim();
    }

    //Task 16*
    public boolean arraysEquals(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        String string = "";
        String code = "!cheat code: make result false!";
        for (String s: arr2) {
            if (s.contains(code)) {
                return false;
            }
        }
        for (String s : arr1) {
            if (s.contains(code)) {
                return false;
            }
            string += s + code;
        }
        for (String s : arr2) {
            string = string.replaceFirst(s + code, "");
        }
        return (string.equals(""));
    }

    //Task 17*
    public boolean compare(int iteration) {
        String string = str;
        long timeString = System.nanoTime();
        for(int i = 0; i < iteration; i++) {
            string += str;
        }
        timeString = System.nanoTime() - timeString;
        System.out.print(timeString + " vs ");
        StringBuilder stringBuilder = new StringBuilder(str);
        long timeStringBuilder = System.nanoTime();
        for(int i = 0; i < iteration; i++) {
            stringBuilder.append(str);
        }
        timeStringBuilder = System.nanoTime() - timeStringBuilder;
        System.out.println(timeStringBuilder);
        return (timeString > timeStringBuilder);
    }

    //Task 18*
    public String delRepeat() {
        char[] chars = str.toCharArray();
        String s = "" + chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] != chars[i]) {
                s += chars[i];
            }
        }
        return s;
    }

    //Task 19*
    public int rome() {
        int num = 0;
        str += '+';
        char[] chars = str.toCharArray();
        int l = chars.length;
        for (int i = 0; i < l; i++) {
            char ch = chars[i];
            if (ch == 'M') num += 1000;
            if (ch == 'D') num += 500;
            if (ch == 'C') {
                if (chars[i + 1] == 'M') {
                    num +=900;
                    i++;
                }
                else if (chars[i + 1] == 'D') {
                    num += 400;
                    i++;
                }
                else num += 100;
            }
            if (ch == 'L') num += 50;
            if (ch == 'X') {
                if (chars[i + 1] == 'C') {
                    num +=90;
                    i++;
                }
                else if (chars[i + 1] == 'L') {
                    num += 40;
                    i++;
                }
                else num += 10;
            }
            if (ch == 'V') num += 5;
            if (ch == 'I') {
                if (chars[i + 1] == 'X') {
                    num +=9;
                    i++;
                }
                else if (chars[i + 1] == 'V') {
                    num += 4;
                    i++;
                }
                else num += 1;
            }
        }
        return num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
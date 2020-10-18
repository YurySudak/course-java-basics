package com.rakovets.course.javabasics.practice.strings;

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
        String[] arr = str.split(" ");
        int num = 0;
        for (String s : arr) {
            if (!s.equals("") && !s.equals("-")) num++;
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
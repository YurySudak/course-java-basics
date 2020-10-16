package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {

    private String str = null;

    public StringUtil(String str) {
        this.str = str;
    }

    public String uniteStrings(String str) {
        return this.str.concat(str);
    }

    public int getIndex(char ch) {
        return str.indexOf(ch);
    }

    public boolean isEqual(String str) {
        return this.str.equals(str);
    }

    public String trimUpperCase() {
        str = str.trim();
        return str.toUpperCase();
    }

    public String subStringFrom10Max23() {
        str = str.substring(10);
        return str.substring(0, 23);
    }

    public String changeSmile() {
        return str.replace(":(", ":)");
    }

    public boolean startsAndEndsWith(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

    public int numberOfVowels() {
        int num = 0;
        for (char ch: str.toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'u' || ch == 'i' || ch == 'e' || ch == 'y' || ch == 'A' || ch == 'O' || ch == 'U' || ch == 'I' || ch == 'E' || ch == 'Y')
                num++;
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

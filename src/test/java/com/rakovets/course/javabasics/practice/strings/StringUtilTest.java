package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringUtilTest {
    StringUtil str = new StringUtil("Hello");

    //Task 1
    @Test
    void uniteStringsTest() {
        Assertions.assertEquals("Hello World", str.uniteStrings(" World"));
        Assertions.assertEquals("Hello-123", str.uniteStrings("-123"));
        Assertions.assertEquals("Hello!", str.uniteStrings("!"));
    }

    //Task 2
    @Test
    void getIndexTest() {
        Assertions.assertEquals(2, str.getIndex('l'));
        Assertions.assertEquals(0, str.getIndex('H'));
        Assertions.assertEquals(-1, str.getIndex('h'));
        Assertions.assertEquals(1, str.getIndex('e'));
        Assertions.assertEquals(4, str.getIndex('o'));
    }

    //Task 3
    @Test
    void isEqualTest() {
        Assertions.assertEquals(true, str.isEqual("Hello"));
        Assertions.assertEquals(false, str.isEqual("hello"));
        Assertions.assertEquals(false, str.isEqual("HELLO"));
        Assertions.assertEquals(false, str.isEqual("World"));
        Assertions.assertEquals(false, str.isEqual("Hello!"));
    }

    //Task 4
    @Test
    void trimUpperCaseTest() {
        Assertions.assertEquals("HELLO", str.trimUpperCase());
        str.setStr(" Hello ");
        Assertions.assertEquals("HELLO", str.trimUpperCase());
        str.setStr("    Hello    ");
        Assertions.assertEquals("HELLO", str.trimUpperCase());
        str.setStr("HELLO ");
        Assertions.assertEquals("HELLO", str.trimUpperCase());
    }

    //Task 5
    @Test
    void subStringFrom10Max23Test() {
        str.setStr("0123456789012345678901234567890123456789");
        Assertions.assertEquals("01234567890123456789012", str.subStringFrom10Max23());
        str.setStr("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        Assertions.assertEquals("class-based, object-ori", str.subStringFrom10Max23());
    }

    //Task 6
    @Test
    void changeSmileTest() {
        str.setStr("Java :(");
        Assertions.assertEquals("Java :)", str.changeSmile());
        str.setStr("Hello :( World!");
        Assertions.assertEquals("Hello :) World!", str.changeSmile());
        str.setStr(";( Oracle");
        Assertions.assertEquals(";( Oracle", str.changeSmile());
    }

    //Task 7
    @Test
    void startsAndEndsWithTest() {
        Assertions.assertTrue(str.startsAndEndsWith("Hello", "Hello"));
        Assertions.assertTrue(str.startsAndEndsWith("HelloHello", "Hello"));
        Assertions.assertTrue(str.startsAndEndsWith("Hello World Hello", "Hello"));
        Assertions.assertFalse(str.startsAndEndsWith("Hello World Hell", "Hello"));
        Assertions.assertFalse(str.startsAndEndsWith("Hello World Hello!", "Hello"));
        Assertions.assertFalse(str.startsAndEndsWith("Java", "Hello"));
    }

    //Task 8
    @Test
    void numberOfVowelsTest() {
        str.setStr("Hello");
        Assertions.assertEquals(2, str.numberOfVowels());
        str.setStr("Java");
        Assertions.assertEquals(2, str.numberOfVowels());
        str.setStr("Yellow");
        Assertions.assertEquals(3, str.numberOfVowels());
        str.setStr("YAHOO!");
        Assertions.assertEquals(4, str.numberOfVowels());
    }

    //Task 9
    @Test
    void numberOfDotsAndCommasAndExclamationMarksTest() {
        str.setStr("Hello, Java!");
        Assertions.assertEquals(2, str.numberOfDotsAndCommasAndExclamationMarks());
        str.setStr("Java.");
        Assertions.assertEquals(1, str.numberOfDotsAndCommasAndExclamationMarks());
        str.setStr("..,,!!");
        Assertions.assertEquals(6, str.numberOfDotsAndCommasAndExclamationMarks());
        str.setStr("YAHOO!");
        Assertions.assertEquals(1, str.numberOfDotsAndCommasAndExclamationMarks());
    }

    //Task 10
    @Test
    void isPalyndromeTest() {
        str.setStr("ABBA");
        Assertions.assertTrue(str.isPalyndrome());
        str.setStr("Madam");
        Assertions.assertTrue(str.isPalyndrome());
        str.setStr("Was it a cat I saw?");
        Assertions.assertTrue(str.isPalyndrome());
        str.setStr("No lemon, no melon.");
        Assertions.assertTrue(str.isPalyndrome());
        str.setStr("Hell to world");
        Assertions.assertFalse(str.isPalyndrome());
    }

    //Task 11
    @Test
    void toArrayTest() {
        str.setStr("Hello world ");
        Assertions.assertEquals(Arrays.asList("Hello ", "world "), Arrays.asList(str.toArray(6)));
        str.setStr("123456789");
        Assertions.assertEquals(Arrays.asList("123", "456", "789"), Arrays.asList(str.toArray(3)));
        str.setStr("Java was originally developed by James Gosling    ");
        Assertions.assertEquals(Arrays.asList("Java was o", "riginally ", "developed ", "by James G", "osling    "), Arrays.asList(str.toArray(10)));
        str.setStr("!@#$%^&");
        Assertions.assertEquals(Arrays.asList("!", "@", "#", "$", "%", "^", "&"), Arrays.asList(str.toArray(1)));
    }

    //Task 12
    @Test
    void numberOfWordsTest() {
        str.setStr("Java applications!");
        Assertions.assertEquals(2, str.numberOfWords());
        str.setStr("  Java coffee, the coffee     from Indonesia.   ");
        Assertions.assertEquals(6, str.numberOfWords());
        str.setStr("write once, run anywhere  -  WORA");
        Assertions.assertEquals(5, str.numberOfWords());
    }

    //Task 13
    @Test
    void fioTest() {
        str.setStr("Gankovich Yuliya Vladimirovna");
        Assertions.assertEquals("G.Y.V.", str.fio());
        str.setStr("goncharuk roman viktorovich");
        Assertions.assertEquals("G.R.V.", str.fio());
        str.setStr("ZMACHINSKIY DMITRY IVANOVICH");
        Assertions.assertEquals("Z.D.I.", str.fio());
        str.setStr("    MASHKOV    Roman    Igorevich    ");
        Assertions.assertEquals("M.R.I.", str.fio());
    }

    //Task 14
    @Test
    void digitsTest() {
        str.setStr("123asd456jkl789");
        Assertions.assertEquals("123456789", str.digits());
        str.setStr("   abc1t tt2h hh3a sd   ");
        Assertions.assertEquals("123", str.digits());
        str.setStr("---000+++*&^%%$111((()))");
        Assertions.assertEquals("000111", str.digits());
    }

    //Task 15
    @Test
    void noRepeatTest() {
        str.setStr("proc");
        Assertions.assertEquals("p r c i n f", str.noRepeat("info"));
        str.setStr("12345");
        Assertions.assertEquals("4 5 6 7 8", str.noRepeat("678123"));
        str.setStr("123abc");
        Assertions.assertEquals("c", str.noRepeat("ba321"));
        str.setStr("qwerty");
        Assertions.assertEquals("", str.noRepeat("qwerty"));
        str.setStr("ZXCCV");
        Assertions.assertEquals("C C", str.noRepeat("VZX"));
    }

    //Task 16*
    @Test
    void arraysEqualsTest() {
        Assertions.assertTrue(str.arraysEquals(new String[]{"Java", "Git", "Idea"}, new String[]{"Java", "Git", "Idea"}));
        Assertions.assertTrue(str.arraysEquals(new String[]{"Java", "Git", "Idea"}, new String[]{"Git", "Idea", "Java"}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java", "Git", "Git"}, new String[]{"Git", "Idea", "Java"}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java", "Git", "Git"}, new String[]{"Git", "Java", "Java"}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java", "Git", "Git"}, new String[]{"Ja", "vaGit", "Git"}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java", "Java"}, new String[]{"Java!cheat code: make result false!Java", ""}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java!cheat code: make result false!Java", ""}, new String[]{"Java", "Java"}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java!cheat code: make result false!Java", ""}, new String[]{"Java!cheat code: make result false!Java", ""}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java", "Git"}, new String[]{"JavaGit", ""}));
        Assertions.assertFalse(str.arraysEquals(new String[]{"Java", "Git", "Idea"}, new String[]{"Git", "Idea", "Java", "Spring"}));
        Assertions.assertTrue(str.arraysEquals(new String[]{"1", "2", "3", "4", "5"}, new String[]{"3", "1", "2", "5", "4"}));
    }

    //Task 17*
    @Test
    void compareTest() {
        str.setStr("Java");
        Assertions.assertTrue(str.compare(10000));
        str.setStr("Oracle (and others) highly recommend uninstalling older versions of Java because of serious risks due to unresolved security issues.");
        Assertions.assertTrue(str.compare(10));
    }

    //Task 18*
    @Test
    void delRepeatTest() {
        str.setStr("aaabbcdeef");
        Assertions.assertEquals("abcdef", str.delRepeat());
        str.setStr("111123444445555");
        Assertions.assertEquals("12345", str.delRepeat());
        str.setStr("FFFfffGGGg");
        Assertions.assertEquals("FfGg", str.delRepeat());
    }

    //Task 19*
    @Test
    void romeTest() {
        str.setStr("IX");
        Assertions.assertEquals(9, str.rome());
        str.setStr("MMMCMXCIX");
        Assertions.assertEquals(3999, str.rome());
        str.setStr("MCMLXXXIII");
        Assertions.assertEquals(1983, str.rome());
        str.setStr("MMCCXXII");
        Assertions.assertEquals(2222, str.rome());
        str.setStr("MMMCDXLIV");
        Assertions.assertEquals(3444, str.rome());
        str.setStr("MMXX");
        Assertions.assertEquals(2020, str.rome());
        str.setStr("CMXCIX");
        Assertions.assertEquals(999, str.rome());
        str.setStr("DCCCLXXXVIII");
        Assertions.assertEquals(888, str.rome());
        str.setStr("XXX");
        Assertions.assertEquals(30, str.rome());
    }
}
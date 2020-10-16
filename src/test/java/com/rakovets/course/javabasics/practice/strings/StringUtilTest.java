package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil str = new StringUtil("Hello");

    @Test
    void uniteStringsTest() {
        Assertions.assertEquals("Hello World", str.uniteStrings(" World"));
        Assertions.assertEquals("Hello-123", str.uniteStrings("-123"));
        Assertions.assertEquals("Hello!", str.uniteStrings("!"));
    }

    @Test
    void getIndexTest() {
        Assertions.assertEquals(2, str.getIndex('l'));
        Assertions.assertEquals(0, str.getIndex('H'));
        Assertions.assertEquals(-1, str.getIndex('h'));
        Assertions.assertEquals(1, str.getIndex('e'));
        Assertions.assertEquals(4, str.getIndex('o'));
    }

    @Test
    void isEqualTest() {
        Assertions.assertEquals(true, str.isEqual("Hello"));
        Assertions.assertEquals(false, str.isEqual("hello"));
        Assertions.assertEquals(false, str.isEqual("HELLO"));
        Assertions.assertEquals(false, str.isEqual("World"));
        Assertions.assertEquals(false, str.isEqual("Hello!"));
    }

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

    @Test
    void subStringFrom10Max23Test() {
        str.setStr("0123456789012345678901234567890123456789");
        Assertions.assertEquals("01234567890123456789012", str.subStringFrom10Max23());
        str.setStr("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        Assertions.assertEquals("class-based, object-ori", str.subStringFrom10Max23());
    }

    @Test
    void changeSmileTest() {
        str.setStr("Java :(");
        Assertions.assertEquals("Java :)", str.changeSmile());
        str.setStr("Hello :( World!");
        Assertions.assertEquals("Hello :) World!", str.changeSmile());
        str.setStr(";( Oracle");
        Assertions.assertEquals(";( Oracle", str.changeSmile());
    }

    @Test
    void startsAndEndsWithTest() {
        Assertions.assertEquals(true, str.startsAndEndsWith("Hello", "Hello"));
        Assertions.assertEquals(true, str.startsAndEndsWith("HelloHello", "Hello"));
        Assertions.assertEquals(true, str.startsAndEndsWith("Hello World Hello", "Hello"));
        Assertions.assertEquals(false, str.startsAndEndsWith("Hello World Hell", "Hello"));
        Assertions.assertEquals(false, str.startsAndEndsWith("Hello World Hello!", "Hello"));
        Assertions.assertEquals(false, str.startsAndEndsWith("Java", "Hello"));
    }

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
}

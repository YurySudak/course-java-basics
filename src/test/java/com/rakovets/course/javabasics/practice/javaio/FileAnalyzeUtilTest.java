package com.rakovets.course.javabasics.practice.javaio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtilTest {

    String sep = File.separator;
    String pathStrings = "src" + sep + "main" + sep + "resources" + sep + "strings.txt";

    @Test
    void task2() {
        List<String> list = Arrays.asList("qqw", "wwE", "EEE", "aaa", "ooo", "UUU");
        assertEquals(list, FileAnalyzeUtil.listString(pathStrings, "all"));
    }

    @Test
    void task3() {
        List<String> list = Arrays.asList("EEE", "aaa", "ooo", "UUU");
        assertEquals(list, FileAnalyzeUtil.listString(pathStrings, "firstVowel"));
    }

    @Test
    void task4() {
        List<String> list = Arrays.asList("qqw", "wwE");
        assertEquals(list, FileAnalyzeUtil.listString(pathStrings, "lastChar"));
    }

    String pathNumbers = "src" + sep + "main" + sep + "resources" + sep + "numbers.txt";
    @Test
    void task5() {
        List<String> list = Arrays.asList("1 2 3", "67 68 69", "1 4 8 56", "3");
        assertEquals(list, FileAnalyzeUtil.listString(pathNumbers, "numbers"));
    }

    @Test
    void task6() {
        List<String> list = Arrays.asList("a-3", "e-4", "o-3", "q-2", "u-3", "w-3");
        assertEquals(list, FileAnalyzeUtil.listText(pathStrings, "lettersFrequency"));
    }

    String pathWords = "src" + sep + "main" + sep + "resources" + sep + "words.txt";
    @Test
    void task7() {
        List<String> list = Arrays.asList("1-io", "1-oop", "3-git", "3-idea", "4-java");
        assertEquals(list, FileAnalyzeUtil.listText(pathWords, "wordsFrequency"));
    }

    String pathSortNumbers = "src" + sep + "main" + sep + "resources" + sep + "sortNumbers.txt";
    @Test
    void task8() {
        List<String> list = Arrays.asList("3", "5", "6", "8", "25", "33", "40", "123");
        assertEquals(list, FileAnalyzeUtil.listText(pathSortNumbers, "sortNumbers"));
    }
}

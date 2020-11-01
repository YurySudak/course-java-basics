package com.rakovets.course.javabasics.practice.javaio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtilTest {

     String sep = File.separator;
     String pathStrings = "src" + sep + "main" + sep + "resources" + sep + "strings.txt";
     String pathNumbers = "src" + sep + "main" + sep + "resources" + sep + "numbers.txt";



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

    @Test
    void task5() {
        List<String> list = Arrays.asList("1 2 3", "67 68 69");
        assertEquals(list, FileAnalyzeUtil.listString(pathNumbers, "numbers"));
    }
}

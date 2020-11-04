package com.rakovets.course.javabasics.practice.jcf.collection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StringCollectionUtilTest {
    String[] data = {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
    List<String> list = new ArrayList<>();
    Set<String> set = new HashSet<>();
    Queue<String> queue = new PriorityQueue<>();
    int length = 4;

    @BeforeEach
    void init() {
        for (String string : data) {
            list.add(string);
            set.add(string);
            queue.add(string);
        }
    }


    @Test
    void task2() {
        String[] arrayExpected = {"*", "is", "*", "of", "fun", "for", "every", "*", "programmer"};
        Set<String> setExpected = new HashSet<>();
        setExpected.addAll(Arrays.asList(arrayExpected));
        StringCollectionUtil.resetWordsByLength(list, length);
        assertTrue(setExpected.containsAll(list));
        StringCollectionUtil.resetWordsByLength(set, length);
        assertTrue(setExpected.containsAll(set));
        StringCollectionUtil.resetWordsByLength(queue, length);
        assertTrue(setExpected.containsAll(queue));
    }

    @Test
    void task3() {
        String[] arrayExpected = {"is", "of", "fun", "for", "every", "programmer"};
        Set<String> setExpected = new HashSet<>();
        setExpected.addAll(Arrays.asList(arrayExpected));
        StringCollectionUtil.removeWordsByLength(list, length);
        assertTrue(setExpected.containsAll(list));
        StringCollectionUtil.removeWordsByLength(set, length);
        assertTrue(setExpected.containsAll(set));
        StringCollectionUtil.removeWordsByLength(queue, length);
        assertTrue(setExpected.containsAll(queue));
    }
}


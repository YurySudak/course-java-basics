package com.rakovets.course.javabasics.practice.generics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MathTest {

    @Test
    void task1() {
        assertEquals(10.0, Math.max(9.99, 10.0, 10.0));
        assertEquals("cz", Math.max("az", "bz", "cz"));
        assertEquals(3, Math.max(1, 2, 3));
    }

    @Test
    void task2() {
        assertEquals(10.0, Math.min(13.0, 12.0, 11.0, 12.0, 10.0));
        assertEquals("aa", Math.min("ea", "ba", "ca", "da", "aa"));
        assertEquals(1, Math.min(1, 5, 3, 4, 2));
    }

    @Test
    void task3() {
        assertEquals("3", Math.average(new Integer[]{1, 2, 3, 4, 5}));
        assertEquals("3.3", Math.average(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5}));
        assertEquals("33333333333333333333", Math.average(new BigInteger[]{new BigInteger("11111111111111111111"), new BigInteger("22222222222222222222"), new BigInteger("33333333333333333333"), new BigInteger("44444444444444444444"), new BigInteger("55555555555555555555")}));
        assertEquals("333.33333333333333333", Math.average(new BigDecimal[]{new BigDecimal("111.11111111111111111"), new BigDecimal("222.22222222222222222"), new BigDecimal("333.33333333333333333"), new BigDecimal("444.44444444444444444"), new BigDecimal("555.55555555555555555")}));
        assertEquals("166.666666666666666665", Math.average(new BigDecimal[]{new BigDecimal("111.11111111111111111"), new BigDecimal("222.22222222222222222")}));
    }

    @Test
    void task4() {
        assertEquals(10.0, Math.arrayMax(new Double[]{9.9, 10.0, 9.99}));
        assertEquals(10, Math.arrayMax(new Integer[]{9, 10, 8}));
        assertEquals("ccc", Math.arrayMax(new String[]{"aaa", "bbb", "ccc"}));
        assertEquals("555.55555555555555555", Math.arrayMax(new BigDecimal[]{new BigDecimal("111.11111111111111111"), new BigDecimal("222.22222222222222222"), new BigDecimal("333.33333333333333333"), new BigDecimal("444.44444444444444444"), new BigDecimal("555.55555555555555555")}).toString());

    }

    @Test
    void task5() {
        assertEquals(9.9, Math.arrayMin(new Double[]{9.9, 10.0, 9.99}));
        assertEquals(8, Math.arrayMin(new Integer[]{9, 10, 8}));
        assertEquals("aaa", Math.arrayMin(new String[]{"aaa", "bbb", "ccc"}));
        assertEquals("111.11111111111111111", Math.arrayMin(new BigDecimal[]{new BigDecimal("111.11111111111111111"), new BigDecimal("222.22222222222222222"), new BigDecimal("333.33333333333333333"), new BigDecimal("444.44444444444444444"), new BigDecimal("555.55555555555555555")}).toString());

    }

    @Test
    void task6() {
        assertArrayEquals(new Double[]{9.9, 9.99, 10.0}, Math.arraySort(new Double[]{9.9, 10.0, 9.99}));
        assertArrayEquals(new Integer[]{8, 9, 10}, Math.arraySort(new Integer[]{9, 10, 8}));
        assertArrayEquals(new String[]{"aaa", "bbb", "ccc"}, Math.arraySort(new String[]{"aaa", "bbb", "ccc"}));

    }

    @Test
    void task7() {
        assertEquals(1, Math.arraySearch(new Double[]{9.9, 10.0, 9.99}, 10.0));
        assertEquals(2, Math.arraySearch(new Integer[]{8, 9, 10}, 10));
        assertEquals(0, Math.arraySearch(new String[]{"aaa", "bbb", "ccc"}, "aaa"));

    }
}

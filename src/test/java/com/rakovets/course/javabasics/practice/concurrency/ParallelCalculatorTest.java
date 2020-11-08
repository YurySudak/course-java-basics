package com.rakovets.course.javabasics.practice.concurrency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorTest {

    private static List list = new ArrayList<>();
    private static int maxNumber = 300;
    private static int maxArrayLength = 10000;
    private static int listSize = 10;

    @BeforeEach
    void init() {
        fillList(list);
    }

    @Test
    void task1() {
        printList(ParallelCalculator.getMax(list));
    }

    @Test
    void task2() {
        int numberOfThreads = 10;
        printList(ParallelCalculator.getMax(list, numberOfThreads));
    }

    @Test
    void task3() {
        System.out.println("01 thread: " + getExeTime(1));
        System.out.println("02 thread: " + getExeTime(2));
        System.out.println("05 thread: " + getExeTime(5));
        System.out.println("10 thread: " + getExeTime(10));
    }

    public static long getExeTime(int numberOfThreads) {
        long startTime = System.nanoTime();
        ParallelCalculator.getMax(list, numberOfThreads);
        long stopTime = System.nanoTime();
        return stopTime - startTime;
    }

    public static void fillList(List list) {

        for(int i = 0; i < listSize; i++) {
            int arrayLength = new Random().nextInt(maxArrayLength) + 1;
            int[] array = new int[arrayLength];
            for(int j = 0; j < arrayLength; j++) {
                array[j] = new Random().nextInt(maxNumber);
            }
            list.add(array);
        }
    }

    public static void printList(List<ArrayMax> list) {
        for(ArrayMax arrayMax : list) {
            System.out.print("array: ");
            for(int number : arrayMax.getArray()) {
                System.out.print(number + " ");
            }
            System.out.println("  max: " + arrayMax.getMax());
        }
    }
}

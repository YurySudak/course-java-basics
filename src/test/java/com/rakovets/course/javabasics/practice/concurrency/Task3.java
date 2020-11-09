package com.rakovets.course.javabasics.practice.concurrency;


public class Task3 {
    public static void main(String[] args) {
        int maxArrayLength = 1000000;
        ParallelCalculatorTest test = new ParallelCalculatorTest(maxArrayLength);
        System.out.println("001 thread: " + test.getExeTime(1));
        System.out.println("02 threads: " + test.getExeTime(2));
        System.out.println("05 threads: " + test.getExeTime(5));
        System.out.println("10 threads: " + test.getExeTime(10));
    }
}
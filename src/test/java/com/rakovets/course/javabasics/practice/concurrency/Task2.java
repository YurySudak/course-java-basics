package com.rakovets.course.javabasics.practice.concurrency;


public class Task2 {
    public static void main(String[] args) {
        int maxArrayLength = 15;
        ParallelCalculatorTest test = new ParallelCalculatorTest(maxArrayLength);
        int numberOfThreads = 5;
        test.printList(ParallelCalculator.calcMax(test.getList(), numberOfThreads));
    }
}


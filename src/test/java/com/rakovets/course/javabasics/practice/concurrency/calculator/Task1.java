package com.rakovets.course.javabasics.practice.concurrency.calculator;


public class Task1 {
    public static void main(String[] args) {
        int maxArrayLength = 10;
        ParallelCalculatorTest test = new ParallelCalculatorTest(maxArrayLength);
        test.printList(ParallelCalculator.calcMax(test.getList()));
    }
}

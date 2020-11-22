package com.rakovets.course.javabasics.practice.concurrency.calculator;

import com.rakovets.course.javabasics.practice.concurrency.calculator.model.ArrayMax;

import java.util.*;

public class ParallelCalculator extends Thread {
    private static Queue<int[]> data;
    private static List<ArrayMax> result;

    public static List<ArrayMax> calcMax(List<int[]> list){
        int defaultNumberOfThreads = 1;
        return calcMax(list, defaultNumberOfThreads);
    }

    public static List<ArrayMax> calcMax(List<int[]> list, int numberOfThreads){
        data = new ArrayDeque<>(list);
        result = new ArrayList<>();
        ParallelCalculator[] calculators = new ParallelCalculator[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            calculators[i] = new ParallelCalculator();
            calculators[i].start();
        }
        joinAll(calculators);
        return new ArrayList<>(result);
    }

    private static void joinAll(ParallelCalculator[] calculators) {
        for (ParallelCalculator calculator : calculators) {
            try {
                calculator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        while (true) {
            int[] array = null;
            synchronized (data) {
                if (!data.isEmpty())
                    array = data.poll();
                else break;
            }
              int max = Arrays.stream(array).max().getAsInt();
              ArrayMax arrayMax = new ArrayMax(array, max);
            synchronized (result) {
                result.add(arrayMax);
            }
        }
    }
}

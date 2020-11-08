package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelCalculator extends Thread {
    private int[] array;
    private int max;
    private static List<ArrayMax> result = new ArrayList<>();

    public ParallelCalculator(int[] array) {
        this.array = array;
    }

    public static List<ArrayMax> getMax(List<int[]> list){
        int defaultNumberOfThreads = 2;
        return getMax(list, defaultNumberOfThreads);
    }

    public static List<ArrayMax> getMax(List<int[]> list, int numberOfThreads){
        ParallelCalculator[] calculators = new ParallelCalculator[numberOfThreads];
        int threads = 0;
        for(int[] arr : list) {
            calculators[threads] = new ParallelCalculator(arr);
            calculators[threads].start();
            threads++;
            if (threads == numberOfThreads) {
                threads = 0;
            }
        }
        for(Thread calculator : calculators) {
            try {
                calculator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void run() {
        synchronized (result) {
            int[] newArray = array.clone();
            Arrays.sort(newArray);
            max = newArray[newArray.length - 1];
            result.add(new ArrayMax(array, max));
        }
    }

}

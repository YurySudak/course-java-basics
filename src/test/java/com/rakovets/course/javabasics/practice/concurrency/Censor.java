package com.rakovets.course.javabasics.practice.concurrency;

import java.io.File;
import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the path to the directory (e.g., src%1$smain%1$sjava%1$scom%1$srakovets%1$scourse%1$sjavabasics%1$sexample%1$sconcurrency): ", File.separator);
        String path = in.nextLine();
        System.out.print("Enter the word to find (e.g., public): ");
        String word = in.nextLine();
        Finder finder = new Finder(path, word);
        Cutter cutter = new Cutter(finder);
        finder.start();
        cutter.start();
        try {
            finder.join();
            if (!finder.isInterrupted()) {
                statistic("Searching... ");
                statistic("Cutting... ");
                cutter.join();
                System.out.println("Job is done! Checkout result.txt");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void statistic(String process) throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + process + i + "%");
            Thread.sleep(20);
        }
        System.out.println();
    }
}

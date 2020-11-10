package com.rakovets.course.javabasics.practice.concurrency;

import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the path to the directory (src\\main\\resources): ");
        String path = "src\\main\\resources";//in.nextLine();
        System.out.print("Enter the word to find (keyword): ");
        String word = "keyword";//in.nextLine();
        Finder finder = new Finder(path, word);
        finder.start();
        try {
            finder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

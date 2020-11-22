package com.rakovets.course.javabasics.practice.concurrency;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            try {
                try {
                    num = Integer.parseInt(input.nextLine());
                    if (num == -1) break;
                    worker.getQueue().offer(num);
                } catch (NumberFormatException e) {
                    throw new InputMismatchException("Data is incorrect!");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        worker.interrupt();
    }
}

package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

import java.util.LinkedList;
import java.util.Random;

public class Store {

    private final LinkedList<Integer> list = new LinkedList<>();
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String BLUE = "\033[0;34m";

    public synchronized void produce() {
        while (!Thread.interrupted()) {
            while (list.size() >= 10) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            int number = new Random().nextInt(1000);
            list.add(number);
            System.out.println(BLUE + "Number " + number + " produced. Store size is " + list.size() + RESET);
            notify();
        }
    }

    public synchronized void consume() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                break;
            }
            while (list.size() <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            int number = list.getFirst();
            list.removeFirst();
            System.out.println(RED + "Number " + number + " consumed. Store size is " + list.size() + RESET);
            notify();
        }

    }
}

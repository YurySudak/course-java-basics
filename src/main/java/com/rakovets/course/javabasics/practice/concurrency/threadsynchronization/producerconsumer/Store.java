package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

import java.util.LinkedList;
import java.util.Random;

public class Store {

    private final LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce() {
        while (true) {
            while (list.size() >= 10) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            int number = new Random().nextInt(1000);
            list.add(number);
            System.out.println("Number " + number + " produced. Store size is " + list.size());
            notify();
        }
    }

    public synchronized void consume() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                break;
            }
            while (list.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            int number = list.getFirst();
            list.removeFirst();
            System.out.println("Number " + number + " consumed. Store size is " + list.size());
            notify();
        }
    }
}

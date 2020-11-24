package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

import com.rakovets.course.javabasics.util.Color;

import java.util.LinkedList;
import java.util.Random;

public class Store {

    private LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce() {
        if (list.size() == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int number = new Random().nextInt(1000);
        list.add(number);
        System.out.println(Color.BLUE + "Number " + number + " produced. Store size is " + list.size() + Color.RESET);
        notify();
    }

    public synchronized void consume() {
        if (list.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int number = list.getFirst();
        list.removeFirst();
        System.out.println(Color.RED + "Number " + number + " consumed. Store size is " + list.size() + Color.RESET);
        notify();
    }
}

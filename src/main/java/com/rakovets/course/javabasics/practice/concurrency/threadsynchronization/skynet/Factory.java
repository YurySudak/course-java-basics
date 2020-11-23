package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import java.util.Random;

public class Factory extends Thread {
    private int head;
    private int torso;
    private int hand;
    private int feet;

    public void run() {
        int max = 10;
        for (int i = 0; i < max; i++) {
            int random = new Random().nextInt(4);
            switch (random) {
                case 0: head++;
                    break;
                case 1: torso++;
                    break;
                case 2: hand++;
                    break;
                case 3: feet++;
                    break;
            }
        }
        System.out.println("Factory produced " + head + " heads, " + torso + " torsos, " + hand + " hands, and " + feet + " feets.");
    }

    public synchronized void consume() {
        int random = new Random().nextInt(4);
        switch (random) {
            case 0:
                if (head > 0) head--;
                else consume();
                break;
            case 1:
                if (torso > 0) torso--;
                else consume();
                break;
            case 2:
                if (hand > 0) hand--;
                else consume();
                break;
            case 3:
                if (feet > 0) feet--;
                else consume();
                break;
        }
        System.out.println("Factory has left " + head + " heads, " + torso + " torsos, " + hand + " hands, and " + feet + " feets.");
    }
}

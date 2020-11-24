package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import com.rakovets.course.javabasics.util.Color;

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
                case 0: head++; break;
                case 1: torso++; break;
                case 2: hand++; break;
                case 3: feet++; break;
            }
        }
        System.out.println(Color.RED + "Factory produced " + head + " heads, " + torso + " torsos, " + hand + " hands, and " + feet + " feets." + Color.RESET);
    }

    public synchronized Part consume() {
        if (head > 0 || torso > 0 || hand > 0 || feet > 0) {
            return tryGet();
        }
        return null;
    }

    private Part tryGet() {
        int random = new Random().nextInt(4);
        switch (random) {
            case 0:
                if (head > 0) {
                    head--;
                    return Part.HEAD;
                }
                break;
            case 1:
                if (torso > 0) {
                    torso--;
                    return Part.TORSO;
                }
                break;
            case 2:
                if (hand > 0) {
                    hand--;
                    return Part.HAND;
                }
                break;
            case 3:
                if (feet > 0) {
                    feet--;
                    return Part.FEET;
                }
                break;
        }
        return tryGet();
    }
}

package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Wednesday extends Thread {
    private int head;
    private int torso;
    private int hand;
    private int feet;
    private int robot;
    Factory factory;

    public Wednesday(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        int max = 5;
        for (int i = 0; i < max; i++) {
            factory.consume();
        }
        while (head > 0 && torso > 0 && hand > 0 && feet > 0) {
            robot++;
            head--;
            torso--;
            hand--;
            feet--;
            System.out.println("Fraction Wednesday made new robot. Total: " + robot);
        }
    }
}

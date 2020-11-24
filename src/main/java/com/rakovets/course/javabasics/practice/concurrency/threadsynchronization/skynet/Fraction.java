package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import com.rakovets.course.javabasics.util.Color;

public class Fraction extends Thread {
    private int head;
    private int torso;
    private int hand;
    private int feet;
    private int robot;
    private Factory factory;
    protected String fractionName;
    protected Color has;
    protected Color made;

    public Fraction(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        Part part;
        while ((part = factory.consume()) != null) {
            switch (part) {
                case HEAD: head++; break;
                case TORSO: torso++; break;
                case HAND: hand++; break;
                case FEET: feet++; break;
            }
        }
        System.out.println(has + "Fraction " + fractionName + " has " + head + " heads, " + torso + " torsos, " + hand + " hands, and " + feet + " feets." + Color.RESET);
        while (head > 0 && torso > 0 && hand > 1 && feet > 1) {
            robot++;
            head--;
            torso--;
            hand -= 2;
            feet -= 2;
            System.out.println(made + "Fraction " + fractionName + " made new robot. Total: " + robot + Color.RESET);
        }
    }

    public int getRobot() {
        return robot;
    }
}



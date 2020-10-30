package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.ParseIntException;

public class Task7 {
    public static void main(String[] args) throws ParseIntException {
        try {
            fiftyPercentProbability();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Method fiftyPercentProbability passed");
        }
    }

    public static void fiftyPercentProbability() throws NullPointerException {
        int random = (int) Math.round(Math.random());
        if (random == 0) throw new NullPointerException();
    }
}

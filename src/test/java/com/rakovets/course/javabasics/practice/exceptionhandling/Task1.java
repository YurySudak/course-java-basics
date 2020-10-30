package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
    public static void main(String[] args) {
        try {
            String string = null;
            string.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

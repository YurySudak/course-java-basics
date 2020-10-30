package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.ParseIntException;

public class Task5 {
    public static void main(String[] args) {
        try {
            try {
                int i = Integer.parseInt("12aaa");
            } catch (NumberFormatException e) {
                throw new ParseIntException(e.getMessage());
            }
        } catch (ParseIntException e) {
            e.printStackTrace(System.out);
        }
    }
}

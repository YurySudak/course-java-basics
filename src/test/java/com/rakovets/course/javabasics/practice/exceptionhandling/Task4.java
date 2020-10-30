package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotEmailException;

public class Task4 {
    public static void main(String[] args) {
        Form form = new Form();
        try {
            form.setEmail("zzz@vvv");
        } catch (NotEmailException e) {
            e.printStackTrace(System.out);
        }
    }
}

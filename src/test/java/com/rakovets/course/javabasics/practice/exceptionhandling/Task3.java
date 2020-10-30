package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotAdultException;

import java.io.Writer;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Form form = new Form();
        try {
            form.setAge(17);
        } catch (NotAdultException e) {
            Writer out;
            e.printStackTrace(System.out);
        }
    }
}

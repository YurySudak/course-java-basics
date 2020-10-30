package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task6 {
    public static void main(String[] args) {
        try {
            threeExceptions();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Number_Format_Exception!");
        }
    }

    public static void threeExceptions() throws NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException {
        int random = (int) Math.floor(Math.random()*3);
        switch (random) {
            case 0: throw new NullPointerException();
            case 1: throw new ArrayIndexOutOfBoundsException();
            case 2: throw new NumberFormatException();
        }
    }
}

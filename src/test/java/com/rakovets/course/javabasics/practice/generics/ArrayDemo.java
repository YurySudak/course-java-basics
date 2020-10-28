package com.rakovets.course.javabasics.practice.generics;

public class ArrayDemo {
    public static void main(String[] args) {
        int capacity = 3;
        Array<Integer> arr = new Array<>(capacity);
        arr.inArray();
        arr.outArray();
        arr.setRandom();
        arr.outArray();
    }
}

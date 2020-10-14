package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(7265);
        System.out.println("Hours: " + time1.getHours());
        System.out.println("Minutes: " + time1.getMinutes());
        System.out.println("Seconds: " + time1.getSeconds());
        time1.setHours(1);
        time1.setMinutes(1);
        time1.setSeconds(1);
        System.out.println("Total seconds 1: " + time1.getTotalSeconds());
        Time time2 = new Time(3, 4, 5);
        System.out.println("Total seconds 2: " + time2.getTotalSeconds());
    }
}

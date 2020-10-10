package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        point2.setX(4);
        point2.setY(5);
        System.out.println("Distance = " + point2.distance(point1));
    }
}

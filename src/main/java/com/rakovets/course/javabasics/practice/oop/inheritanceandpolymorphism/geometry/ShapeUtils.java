package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class ShapeUtils {
    public static boolean isRectangle(Figure figure) {
        return (figure.toString().equals("Rectangle"));
    }

    public static boolean isTriangle(Figure figure) {
        return (figure.toString().equals("Triangle"));
    }
}

package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point point1 = new Point(-1, -1);
        Point point2 = new Point(1, 1);
        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println("Area = " + rectangle.getArea());
        rectangle.setFirstPoint(point2);
        Point point3 = new Point(5, 6);
        rectangle.setSecondPoint(point3);
        System.out.println("x1: " + rectangle.getFirstPoint().getX() + "   y1: " + rectangle.getFirstPoint().getY());
        System.out.println("x2: " + rectangle.getSecondPoint().getX() + "   y2: " + rectangle.getSecondPoint().getY());
    }
}

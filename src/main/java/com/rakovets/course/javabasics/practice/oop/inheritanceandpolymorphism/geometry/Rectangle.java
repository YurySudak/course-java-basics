package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Rectangle extends Parallelogram {

    public Rectangle(Point[] point) {
        super(point);
        double[] diagonals = getDiagonals();
        if (diagonals[0] != diagonals[1])
            System.out.println("Error! This is not a rectangle!");
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}

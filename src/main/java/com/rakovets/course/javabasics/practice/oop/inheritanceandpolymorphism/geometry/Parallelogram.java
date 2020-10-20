package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Parallelogram extends Quadrangle {

    public Parallelogram(Point[] point) {
        super(point);
        double[] sides = getSides();
        if (sides[0] != sides [2] || sides[1] != sides[3])
            System.out.println("Error! This is not a parallelogram!");
    }

    @Override
    public String toString() {
        return "Parallelogram";
    }
}

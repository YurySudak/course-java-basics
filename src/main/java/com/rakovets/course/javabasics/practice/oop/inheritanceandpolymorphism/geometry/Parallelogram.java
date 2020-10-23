package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Parallelogram extends Quadrangle {

    public Parallelogram(Point[] point) {
        super(point);
    }

    public boolean parallelSides() {
        double[] sides = getSides();
        return  (sides[0] == sides [2] || sides[1] == sides[3]);
    }

    @Override
    public String toString() {
        return "Parallelogram";
    }
}

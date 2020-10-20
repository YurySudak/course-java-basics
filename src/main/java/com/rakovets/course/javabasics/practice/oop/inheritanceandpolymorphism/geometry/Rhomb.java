package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Rhomb extends Parallelogram {

    public Rhomb(Point[] point) {
        super(point);
        double[] sides = getSides();
        if (sides[0] != sides [1])
            System.out.println("Error! This is not a rhomb!");
    }

    @Override
    public String toString() {
        return "Rhomb";
    }
}

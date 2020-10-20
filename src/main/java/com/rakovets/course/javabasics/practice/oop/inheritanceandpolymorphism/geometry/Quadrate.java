package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Quadrate extends Rhomb {

    public Quadrate(Point[] point) {
        super(point);
        double[] diagonals = getDiagonals();
        if (diagonals[0] != diagonals[1])
            System.out.println("Error! This is not a quadrate!");
    }

    @Override
    public String toString() {
        return "Quadrate";
    }
}

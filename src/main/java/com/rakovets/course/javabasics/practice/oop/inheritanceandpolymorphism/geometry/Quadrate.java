package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Quadrate extends Rhomb implements Rectangleable, Rhombable {

    public Quadrate(Point[] point) {
        super(point);
    }

    @Override
    public String toString() {
        return "Quadrate";
    }

    @Override
    public boolean equalsDiagonals(){
        double[] diagonals = getDiagonals();
        return (diagonals[0] == diagonals[1]);
    }

    @Override
    public boolean equalsSides() {
        double[] sides = getSides();
        return  (sides[0] == sides [1]);
    }
}

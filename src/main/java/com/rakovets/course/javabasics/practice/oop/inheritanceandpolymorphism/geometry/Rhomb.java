package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Rhomb extends Parallelogram implements Rhombable{

    public Rhomb(Point[] point) {
        super(point);

    }

    @Override
    public String toString() {
        return "Rhomb";
    }

    @Override
    public boolean equalsSides() {
        double[] sides = getSides();
        return  (sides[0] == sides [1]);
    }
}

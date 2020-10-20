package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Segment extends Polyline {
    public Segment(Point[] point) {
        super(point);
        if (point.length > 2)
            System.out.println("Error! This is not a segment!");
    }

    @Override
    public String toString() {
        return "Segment";
    }
}

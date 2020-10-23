package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Segment extends Polyline {
    public Segment(Point[] point) {
        super(point);
    }

    public boolean isSegment() {
        return  (point.length <= 2);
    }

    @Override
    public String toString() {
        return "Segment";
    }
}

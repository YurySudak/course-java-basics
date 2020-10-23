package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Rectangle extends Parallelogram implements Rectangleable {

    public Rectangle(Point[] point) {
        super(point);
    }

    @Override
    public boolean equalsDiagonals(){
        double[] diagonals = getDiagonals();
        return (diagonals[0] == diagonals[1]);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}

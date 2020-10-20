package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public abstract class Figure {

    public boolean equalSquare(Figure figure) {
        return (this.getSquare() == figure.getSquare());
    }

    public double getSquare() {
        return 0;
    }
}

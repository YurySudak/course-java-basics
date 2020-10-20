package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Triangle extends Figure implements Closed {
    private Point[] point;

    public Triangle(Point[] point) {
        this.point = point;
    }

    public double[] getSides() {
        double[] sides = new double[3];
        int j = 0;
        double x = 0;
        double y = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 2) j = 0;
            else j = i + 1;
            x = point[i].getX() - point[j].getX();
            y = point[i].getY() - point[j].getY();
            sides[i] = Math.sqrt(x * x + y * y);
        }
        return sides;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        double result = p;
        double[] sides = getSides();
        for (double side : sides) {
            result *= p - side;
        }
        return Math.sqrt(result);
    }

    @Override
    public double getPerimeter() {
        double[] lines = getSides();
        double result = 0;
        for (double line : lines) {
            result += line;
        }
        return result;
    }

    public Point[] getPoint() {
        return point;
    }

    public void setPoint(Point[] point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}

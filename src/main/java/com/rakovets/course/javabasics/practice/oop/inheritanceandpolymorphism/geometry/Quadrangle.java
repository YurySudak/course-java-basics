package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Quadrangle extends Figure implements Closed {

    private Point[] point;

    public Quadrangle(Point[] point) {
        this.point = point;
    }

    public double[] getSides() {
        double[] sides = new double[4];
        int j = 0;
        double x = 0;
        double y = 0;
        for (int i = 0; i < 4; i++) {
            if (i == 3) j = 0;
            else j = i + 1;
            x = point[i].getX() - point[j].getX();
            y = point[i].getY() - point[j].getY();
            sides[i] = Math.sqrt(x * x + y * y);
        }
        return sides;
    }

    public double[] getDiagonals() {
        double[] diagonals = new double[2];
        double x = point[0].getX() - point[2].getX();
        double y = point[0].getY() - point[2].getY();
        diagonals[0] = Math.sqrt(x * x + y * y);
        x = point[1].getX() - point[3].getX();
        y = point[1].getY() - point[3].getY();
        diagonals[1] = Math.sqrt(x * x + y * y);
        return diagonals;
        }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        double result = 1;
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
        return "Quadrangle";
    }
}

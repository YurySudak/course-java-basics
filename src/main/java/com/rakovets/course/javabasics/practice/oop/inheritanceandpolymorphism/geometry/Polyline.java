package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry;

public class Polyline extends Figure implements Opened {

    private Point[] point;

    public Polyline(Point[] point) {
        this.point = point;
    }

    @Override
    public double getLength() {
        double length = 0;
        double x = 0;
        double y = 0;
        for (int i = 1; i < point.length; i++) {
            x = point[i - 1].getX() - point[i].getX();
            y = point[i - 1].getY() - point[i].getY();
            length += Math.sqrt(x * x + y * y);
        }
        return length;
    }

    public Point[] getPoint() {
        return point;
    }

    public void setPoint(Point[] point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Polyline";
    }
}

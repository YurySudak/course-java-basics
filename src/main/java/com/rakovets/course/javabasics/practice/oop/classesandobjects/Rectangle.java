package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    private Point firstPoint;
    private Point secondPoint;

    Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point point) {
        this.firstPoint = point;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point point) {
        this.secondPoint = point;
    }

    public int getPerimeter() {
        int x = this.firstPoint.getX() - this.secondPoint.getX();
        int y = this.firstPoint.getY() - this.secondPoint.getY();
        return 2 * Math.abs(x) + 2 * Math.abs(y);
    }

    public double getArea() {
        int x = this.firstPoint.getX() - this.secondPoint.getX();
        int y = this.firstPoint.getY() - this.secondPoint.getY();
        return Math.abs(x * y);
    }
}

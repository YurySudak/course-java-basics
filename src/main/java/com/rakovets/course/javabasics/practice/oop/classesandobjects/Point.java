package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return this.x;
    }
    void setX(int x) {
        this.x = x;
    }
    int getY() {
        return this.y;
    }
    void setY(int y) {
        this.y = y;
    }
    double distance(Point point) {
        int x = point.getX() - this.x;
        int y = point.getY() - this.y;
        return Math.sqrt(x * x + y * y);
    }
}

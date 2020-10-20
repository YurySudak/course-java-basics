package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry.*;

public class GeometryTest {
    public static void main(String[] args) {
        Quadrangle quadrangle = new Quadrangle(new Point[]{new Point(-1, -1), new Point(-1, 1), new Point(2, 1), new Point(2, -1)});
        System.out.println(quadrangle.getPerimeter());
        System.out.println(quadrangle.getSquare());
        System.out.println();

        Parallelogram parallelogram = new Parallelogram(new Point[]{new Point(-2, -2), new Point(-3, 3), new Point(4, 4), new Point(5, -1)});
        System.out.println(parallelogram.getPerimeter());
        System.out.println(parallelogram.getSquare());
        System.out.println();

        parallelogram.setPoint(new Point[]{new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        System.out.println(parallelogram.getPerimeter());
        System.out.println(parallelogram.getSquare());
        System.out.println(parallelogram.getDiagonals()[0] + " " + parallelogram.getDiagonals()[1]);
        System.out.println();

        Rectangle rectangle = new Rectangle(new Point[]{new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        System.out.println(rectangle.getSquare());
        System.out.println();

        Rhomb rhomb = new Rhomb(new Point[]{new Point(1, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        System.out.println(rhomb.getDiagonals()[0] + " " + parallelogram.getDiagonals()[1]);
        System.out.println();

        Quadrate quadrate = new Quadrate(new Point[]{new Point(1, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        System.out.println(quadrate.getPerimeter());
        System.out.println();

        Polyline polyline = new Polyline(new Point[]{new Point(-1, -1), new Point(-1, 1), new Point(2, 1), new Point(2, -1), new Point(2, -3)});
        System.out.println(polyline.getLength());
        System.out.println();

        Segment segment = new Segment(new Point[]{new Point(-1, -1), new Point(-1, 1), new Point(2, 1), new Point(2, -1), new Point(2, -3)});
        System.out.println(segment.getLength());
        System.out.println();

        Figure figure = new Quadrate(new Point[]{new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        System.out.println(figure.getSquare());
        System.out.println(figure.equalSquare(rectangle));
        System.out.println();

        Circle circle = new Circle(new Point(1,1), 5);
        System.out.println(circle.getSquare());
        System.out.println();

        figure = circle;
        System.out.println(figure.equalSquare(quadrate));
        System.out.println();

        Triangle triangle = new Triangle(new Point[]{new Point(-1, -1), new Point(-1, 2), new Point(3, -1)});
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare());
        System.out.println();

        System.out.println(figure.toString());
        figure = quadrangle;
        System.out.println(figure.toString());
        System.out.println();

        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isRectangle(circle));
        System.out.println();

        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(ShapeUtils.isTriangle(quadrate));
    }
}

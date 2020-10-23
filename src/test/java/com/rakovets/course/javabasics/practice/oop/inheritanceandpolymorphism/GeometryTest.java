package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.geometry.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeometryTest {

    @Test
    void test() {
        Quadrangle quadrangle = new Quadrangle(new Point[]{new Point(-1, -1), new Point(-1, 1), new Point(2, 1), new Point(2, -1)});
        assertTrue(quadrangle instanceof Figure);
        assertEquals(10, quadrangle.getPerimeter());
        assertEquals(6, quadrangle.getSquare());
        Parallelogram parallelogram = new Parallelogram(new Point[]{new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        assertTrue(parallelogram instanceof Quadrangle);
        assertEquals(14, parallelogram.getPerimeter());
        assertEquals(12, parallelogram.getSquare());
        assertTrue(parallelogram.parallelSides());
        assertTrue(Arrays.equals( new double[]{5, 5}, parallelogram.getDiagonals()));
        Rectangle rectangle = new Rectangle(new Point[]{new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        assertTrue(rectangle instanceof Parallelogram);
        assertEquals(12, rectangle.getSquare());
        Rhomb rhomb = new Rhomb(new Point[]{new Point(1, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        assertTrue(rhomb instanceof Parallelogram);
        assertFalse(rhomb.equalsSides());
        Quadrate quadrate = new Quadrate(new Point[]{new Point(0, 0), new Point(0, 3), new Point(3, 3), new Point(3, 0)});
        assertEquals(9, quadrate.getSquare());
        assertEquals(12, quadrate.getPerimeter());
        assertTrue(quadrate.equalsDiagonals());
        assertTrue(quadrate.equalsSides());
        Polyline polyline = new Polyline(new Point[]{new Point(-1, -1), new Point(-1, 1), new Point(2, 1), new Point(2, -1), new Point(2, -3)});
        assertEquals(9, polyline.getLength());
        Segment segment = new Segment(new Point[]{new Point(-1, -1), new Point(-1, 1), new Point(2, 1), new Point(2, -1), new Point(2, -3)});
        assertFalse(segment.isSegment());
        Figure figure = new Quadrate(new Point[]{new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)});
        assertEquals(12, figure.getSquare());
        assertTrue(figure.equalSquare(rectangle));
        Circle circle = new Circle(new Point(1,1), 5);
        assertEquals(79, Math.round(circle.getSquare()));
        figure = circle;
        assertFalse(figure.equalSquare(quadrate));
        Triangle triangle = new Triangle(new Point[]{new Point(-1, -1), new Point(-1, 2), new Point(3, -1)});
        assertEquals(12, triangle.getPerimeter());
        assertEquals(6, triangle.getSquare());
        assertEquals("Circle", figure.toString());
        figure = quadrangle;
        assertEquals("Quadrangle", figure.toString());
        assertTrue(ShapeUtils.isRectangle(rectangle));
        assertFalse(ShapeUtils.isRectangle(circle));
        assertTrue(ShapeUtils.isTriangle(triangle));
        assertFalse(ShapeUtils.isTriangle(quadrate));
    }
}

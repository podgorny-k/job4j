package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        int expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double expected = 1.41;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to00then2() {
        Point a = new Point(2, 2);
        Point b = new Point(0, 0);
        double expected = 2.82;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11then1() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double expected = 1.41;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}
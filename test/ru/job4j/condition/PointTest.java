package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to00then2() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 0;
        int y2 = 0;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11then1() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
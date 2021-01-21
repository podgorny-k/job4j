package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.job4j.condition.SqArea.square;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        int k = 2;
        int expected = 2;
        double out = square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K1Then1() {
        int p = 5;
        int k = 1;
        int expected = 1;
        double out = square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP22K5Then5() {
        int p = 22;
        int k = 5;
        int expected = 5;
        double out = square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP35K11Then11() {
        int p = 35;
        int k = 11;
        int expected = 11;
        double out = square(p, k);
        assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        Fact fa = new Fact();
        fa.calc(-1);
    }
}
package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(8, 4, 2);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenNotMax() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}
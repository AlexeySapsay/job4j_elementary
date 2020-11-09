package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void when222ThenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void when333ThenExist() {
        boolean result = Triangle.exist(3.0, 3.0, 3.0);
        assertThat(result, is(true));
    }

    @Test
    public void when000ThenExist() {
        boolean result = Triangle.exist(0.0, 0.0, 0.0);
        assertThat(result, is(false));
    }

    @Test
    public void when1100ThenExist() {
        boolean result = Triangle.exist(11.0, 0.0, 0.0);
        assertThat(result, is(false));
    }
}
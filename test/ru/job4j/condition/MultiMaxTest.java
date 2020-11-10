package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 2, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdAndFirstEquvalentMax() {
        int result = MultiMax.max(4, 2, 4);
        assertThat(result, is(4));
    }
}
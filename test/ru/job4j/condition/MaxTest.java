package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1equals2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxSecondThen4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax100Then100() {
        int result = Max.max(0, -1, -123, 100);
        assertThat(result, is(100));
    }

    @Test
    public void whenMax0Then0() {
        int result = Max.max(0, -1, -2, -3);
        assertThat(result, is(0));
    }

    @Test
    public void whenNegativeNumber() {
        assertThat(Max.max(-10, -1), is(-1));
    }
}
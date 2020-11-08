package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01To22Then2() {
        int x1 = 0;
        int x2 = 1;
        int y1 = 2;
        int y2 = 2;
        double expected = 2.23;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To99Then2() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 9;
        int y2 = 9;
        double expected = 11.31;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

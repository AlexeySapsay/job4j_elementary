package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;

        Point one = new Point(0, 0);
        Point two = new Point(2, 0);

        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01To22Then2() {
        double expected = 2.23;

        Point one = new Point(0, 1);
        Point two = new Point(2, 2);

        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To99Then2() {
        double expected = 11.31;

        Point one = new Point(1, 1);
        Point two = new Point(9, 9);

        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to000Then0() {
        double expected = 0;

        Point one = new Point(0, 0, 0);
        Point two = new Point(0, 0, 0);

        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100to001Then0() {
        double expected = 1.41;

        Point one = new Point(1, 0, 0);
        Point two = new Point(0, 0, 1);

        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to999Then0() {
        double expected = 13.856;

        Point one = new Point(1, 1, 1);
        Point two = new Point(9, 9, 9);

        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}

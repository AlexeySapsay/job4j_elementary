package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7k3ThenSquare4() {
        int expected = 2;
        int p = 7;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4ThenSquare5() {
        int expected = 0;
        int p = 4;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP100k34ThenSquare10() {
        int expected = 34;
        int p = 100;
        int k = 34;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan160Then69() {
        short in = 160;
        double expected = 69.0;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan150Then5749() {
        short in = 150;
        double expected = 57.49;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan140Then46() {
        short in = 140;
        double expected = 46.0;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan130Then34() {
        short in = 130;
        double expected = 34.5;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan120Then23() {
        short in = 120;
        double expected = 23.0;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan110Then11() {
        short in = 110;
        double expected = 11.5;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan100Then0() {
        short in = 100;
        double expected = 0.0;
        double out = Fit.calculateManIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman190Then92() {
        short in = 190;
        double expected = 92.0;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman180Then80() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69.0;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman160Then57() {
        short in = 160;
        double expected = 57.49;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman150Then50() {
        short in = 150;
        double expected = 46.0;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman140Then34() {
        short in = 140;
        double expected = 34.5;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman130Then23() {
        short in = 130;
        double expected = 23.0;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman120Then11() {
        short in = 120;
        double expected = 11.5;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman110Then11() {
        short in = 110;
        double expected = 0.0;
        double out = Fit.calculateWomanIdealWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
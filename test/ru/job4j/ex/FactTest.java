package ru.job4j.ex;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNSmallerThenZero() {
        Fact.calc(-1);
    }
}
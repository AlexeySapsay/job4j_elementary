package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when60by35() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 5};
        int[] rsl = machine.change(60, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by35() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 5};
        int[] rsl = machine.change(100, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by11() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 5, 2, 2};
        int[] rsl = machine.change(50, 11);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by19() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 1};
        int[] rsl = machine.change(50, 19);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when11by2() {
        Machine machine = new Machine();
        int[] expected = {5, 2, 2};
        int[] rsl = machine.change(11, 2);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when0by0() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(0, 0);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when0byMinus2() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(-2, 0);
        assertThat(rsl, is(expected));
    }

}
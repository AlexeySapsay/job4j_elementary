package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixTest {

    @Test
    public void when2On2Then() {
        int[][] table = Matrix.multiple(2);
        int[][] expect = {{1, 2}, {2, 4}};
        assertThat(table, is(expect));
    }

    @Test
    public void when3On3Then() {
        int[][] table = Matrix.multiple(3);
        int[][] expect = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertThat(table, is(expect));
    }

    @Test
    public void when4On4Then() {
        int[][] table = Matrix.multiple(4);
        int[][] expect = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
        assertThat(table, is(expect));
    }
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort21354Then12345() {
        int[] input = new int[]{2, 1, 3, 5, 4};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort321Then123() {
        int[] input = new int[]{3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort852134679Then123456789() {
        int[] input = new int[]{8, 5, 2, 1, 3, 4, 6, 7, 9};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
    }
}
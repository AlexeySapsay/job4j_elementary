package ru.job4j.array;

/**
 * Даны два отсортированных по возрастанию массива.
 * Как без сортировки их объединить в третий массив?
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        int ll = left.length;
        int rl = right.length;
        // take elements from left and right arrays
        while (i < ll && j < rl) {
            if (left[i] < right[j]) {
                rsl[k++] = left[i++];
            } else {
                rsl[k++] = right[j++];
            }
        }
        // take remains elements from left array
        while (i < ll) {
            rsl[k++] = left[i++];
        }
        // take remains elements from right array
        while (j < rl) {
            rsl[k++] = right[j++];
        }
        return rsl;
    }
}
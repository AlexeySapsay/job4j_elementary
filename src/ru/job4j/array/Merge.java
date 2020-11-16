package ru.job4j.array;

/**
 * Даны два отсортированных по возрастанию массива.
 * Как без сортировки их объединить в третий массив?
 *
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslIndex = 0;
        for (int indexLeft = 0; indexLeft < left.length; indexLeft++) {
            for (int indexRight = 0; indexRight < right.length; indexRight++) {
                if (left[indexLeft] > right[indexRight]) {
                    rsl[rslIndex] = right[indexRight];
                    rslIndex += 1;
                    System.out.println(rsl[0]);
                }

            }
        }
        return rsl;
    }
}
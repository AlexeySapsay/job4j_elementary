package ru.job4j.array;

/**
 * Даны два отсортированных по возрастанию массива.
 * Как без сортировки их объединить в третий массив?
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        if ((left.length == 0) && (right.length == 0)) return right;
        if ((left.length == 0) && (right.length != 0)) return right;
        if ((right.length == 0) && (right.length != 0)) return left;

        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];

            if (leftIndex == left.length) {
                for (int j = rightIndex; j < right.length - rightIndex; j++) {
                    rsl[index] = right[j];
                    //j++;
                    index++;
                }
                return rsl;
            }
            if (rightIndex == right.length) {
                for (int k = leftIndex; k < left.length - leftIndex; k++) {
                    rsl[index] = left[k];
                    //k++;
                    index++;
                }
                return rsl;
            }
        }
        return rsl;
    }
}
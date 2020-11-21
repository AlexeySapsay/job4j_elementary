package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        int n = 0;
        int nminus1 = 2;
        int nminus2 = 1;

        if (nminus2 != data[0] || nminus1 != data[1]) {
            return false;
        }

        for (int index = 2; index < data.length; index++) {
                n = nminus1 + nminus2;
                nminus2 = nminus1;
                nminus1 = n;

            if (data[index] != n) {
                return false;
            }
        }

        return true;
    }
}

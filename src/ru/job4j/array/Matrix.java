package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int multiplicator1 = 1;
        for (int row = 0; row < table.length; row++) {
            int multiplicator2 = 1;
            for (int cell = 0; cell < table.length; cell++) {
                table[row][cell] = multiplicator1 * multiplicator2;
                multiplicator2++;
            }
            multiplicator1++;
        }
        return table;
    }
}

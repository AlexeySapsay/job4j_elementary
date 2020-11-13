package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int cell = 0; cell < board.length; cell++) {
            int value = board[row][cell];
            if (value != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            int value = board[row][column];
            if (value != 'X') {
                return false;
            }
        }
        return true;
    }
}

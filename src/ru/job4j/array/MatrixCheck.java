package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int cell = row; cell < board.length; cell++) {
            int value = board[row][cell];
            if (value != 'X') {
                return false;
            }
        }
        return true;
    }
}

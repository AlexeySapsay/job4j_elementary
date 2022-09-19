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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        int indexElement = 0;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                indexElement = index;
                break;
            }
        }
        return ((monoHorizontal(board, indexElement)) || (monoVertical(board, indexElement)));
    }
}

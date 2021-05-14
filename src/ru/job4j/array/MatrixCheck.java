package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] arr, int row) {
        boolean res = true;
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] != 'X') {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean monoVertical(char[][] arr, int col) {
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != 'X') {
                res = false;
                break;
            }
        }
        return res;

    }

    public static char[] extractDiagonal(char[][] arr) {
        char[] res = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i][i];
        }
        return res;
    }

    public static boolean isWin(char[][] board) {
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if ((monoHorizontal(board, i)) || monoVertical(board, i)) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }
}

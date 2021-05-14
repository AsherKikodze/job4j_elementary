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
}

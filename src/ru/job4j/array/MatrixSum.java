package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                res += array[i][j];
            }
        }
        return res;
    }
}

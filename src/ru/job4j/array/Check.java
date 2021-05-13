package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] arr) {
        boolean res = true;
        for (int i = 1; i < arr.length -  1; i++) {
            if (arr[i] != arr[0]) {
                res = false;
                break;
            }
            }
        return res;
    }
}

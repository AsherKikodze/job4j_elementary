package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] res = new int[bound];
        for (int i = 0; i < bound; i++) {
            res[i] = i * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = Square.calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

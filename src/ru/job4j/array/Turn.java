package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        boolean odd = array.length % 2 == 0;
        int temp;
        int border = array.length % 2 == 0 ? (array.length / 2) : (array.length / 2);
            for (int i = 0; i < border; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        return array;
    }

}

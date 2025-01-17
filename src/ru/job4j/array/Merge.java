package ru.job4j.array;

public class Merge {
    public static  int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < left.length + right.length) {
            if ((i < left.length) && (j < right.length)) {
                if (left[i] <= right[j]) {
                    rsl[k++] = left[i++];
                } else {
                    rsl[k++] = right[j++];
                }
            } else if (j >= right.length) {
                rsl[k++] = left[i++];
            } else {
                rsl[k++] = right[j++];
            }
        }
        return rsl;
    }
}

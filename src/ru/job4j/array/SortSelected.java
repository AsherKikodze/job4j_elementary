package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int val = MinDiapason.findMin(data, i, data.length - 1);
            int num = FindLoop.indexOf(data, val, i, data.length - 1);
            data = SwitchArray.swap(data, i, num);
        }
        return data;
    }
}

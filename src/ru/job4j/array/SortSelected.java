package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int val;
        int num;
        for (int i = 0; i < data.length; i++) {
            val = MinDiapason.findMin(data, i, data.length - 1);
            num = FindLoop.indexOf(data, val, i, data.length - 1);
            data = SwitchArray.swap(data, i, num);
        }
        return data;
    }
}

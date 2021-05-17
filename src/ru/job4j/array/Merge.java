package ru.job4j.array;

public class Merge {
    public static  int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        boolean condition = true;
        int i = 0;
        int j = 0;
        int k = 0;
        while (true) {
            if ((i < left.length) && (j < right.length)) { // Оба массива еще не пройдены
                if (left[i] <= right[j]) { // Если значение в левом не больше правого, ставим левый
                    rsl[k] = left[i];
                    k++;
                    i++;
                } else { // Если значение в правом меньше левого, ставим девый
                    rsl[k] = right[j];
                    k++;
                    j++;
                }
            } else if (i >= left.length) { // Пройден левый массив, дополняем остатками правого
                for (int l = j; l < right.length; l++) {
                    rsl[k] = right[l];
                    k++;
                }
                break;
            } else { // Пройден правый массив, дополняем остатками левого
                for (int l = i; l < left.length; l++) {
                    rsl[k] = left[l];
                    k++;
                }
                break;
            }

        }
        return rsl;
    }
}

package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int rem = money - price;
        while (rem > 0) {
            for (int i = 0; i < coins.length; i++) {
                for (int j = 0; j < rem / coins[i]; j++) {
                    rsl[size] = coins[i];
                    size++;
                }
                rem = rem - coins[i] * (rem / coins[i]);
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
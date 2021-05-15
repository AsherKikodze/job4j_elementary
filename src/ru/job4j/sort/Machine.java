package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change1(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int rem = money - price;
             for (int i = 0; i < coins.length; i++) {
                 while (rem > coins[i]) {
                     rsl[size] = coins[i];
                     size++;
                     rem -= coins[i];
                 }
            }
         return Arrays.copyOf(rsl, size);
    }

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int k = 0;
        int rem = money - price;
        while (rem > 0) {
            if (rem - coins[k] < 0) {
                k++;
            }
            rsl[size] = coins[k];
            size++;
            rem = rem - coins[k];
        }
        return Arrays.copyOf(rsl, size);
    }

}
package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int c = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                c += 1;
            }
        }
        return c;
    }
}

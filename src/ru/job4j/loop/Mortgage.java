package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int n = 0;
        while (amount > 0) {
            amount *= (1.0 + percent / 100.0);
            amount -= salary;
            n += 1;
        }
        return n;
    }
}

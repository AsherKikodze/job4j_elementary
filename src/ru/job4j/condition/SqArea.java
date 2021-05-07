package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double rs = 0.5 * p / (k + 1);
        double l = rs * k;
        rs = l * rs;
        return rs;
    }

    public static void main(String[] args) {
        double res = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, square = " + res);
    }
}

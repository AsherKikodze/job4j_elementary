package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womenWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static void main(String[] args) {
        short height = 170;
        System.out.println("Man " + height + " is " + Fit.manWeight(height));
        System.out.println("Lady " + height + " is " + Fit.womenWeight(height));
    }
}

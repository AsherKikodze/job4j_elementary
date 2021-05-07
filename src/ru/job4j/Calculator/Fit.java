package ru.job4j.Calculator;

import java.util.Calendar;

public class Fit {
    public static float manWeight(short height) {
        return (float) ((height - 100) * 1.15);
    }

    public static float womenWeight(short height) {
        return (float) ((height - 100) * 1.15);
    }

    public static void main(String[] args) {
        short height = 170;
        System.out.println("Man " + height + " is " + Fit.manWeight(height));
        System.out.println("Lady " + height + " is " + Fit.womenWeight(height));
    }
}

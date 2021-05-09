package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        //Предположим, что реальный курс доллара 80
        in = 160;
        expected = 2;
        passed = expected == Converter.rubleToDollar(in);
        System.out.println("160 rubles are 2 USD. Test result : " + passed);
    }
}

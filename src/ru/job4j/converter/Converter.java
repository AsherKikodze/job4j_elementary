package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rub = 140;
        //Converter.rubleToEuro(rub);
        System.out.println(rub + " rubles are " + Converter.rubleToEuro(rub) + " euro");
        System.out.println(rub + " rubles are " + Converter.rubleToDollar(rub) + " USD");
    }
}

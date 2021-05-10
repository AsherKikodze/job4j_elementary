package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rs1;
        if (number % 6 == 0) {
            rs1 = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rs1 = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            rs1 = "Исходное число не делится на 3, но является четным.";
        } else {
            rs1 = "Исходное число не делится на 3 и не является четным.";
        }
        return rs1;
    }
}

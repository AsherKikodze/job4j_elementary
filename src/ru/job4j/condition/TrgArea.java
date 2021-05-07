package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = -1;
        p = 0.5 * (a + b + c);
        p = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return p;
    }

    public static void main(String[] args) {
        double rs1 = TrgArea.area(2, 2, 2);
        System.out.println("Area 2,2,2 = " + rs1);
    }
}

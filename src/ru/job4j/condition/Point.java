package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    public static void main(String[] args) {
        double res = Point.distance(0,0,2,0);
        System.out.println("result (0, 0) to (2, 0) is " + res);
    }
}
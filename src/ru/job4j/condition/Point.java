package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2)
                        + Math.pow((this.y - that.y), 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2)
                        + Math.pow((this.y - that.y), 2)
                        + Math.pow((this.z - that.z), 2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 0);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }
}

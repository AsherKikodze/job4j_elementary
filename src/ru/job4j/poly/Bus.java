package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toMove() {
        System.out.println("Moving");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Number of passengers " + number);
    }

    @Override
    public double toLoad(int fuel) {
        return fuel * 3.24;
    }
}

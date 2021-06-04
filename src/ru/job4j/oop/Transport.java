package ru.job4j.oop;

public class Transport {

    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = {plane, bus, train};
        for (Vehicle i: vehicles) {
            i.move();
        }
    }
}

package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train in moving by rails");
    }
}

package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = student;
        Object object1 = freshman;
        Object object2 = freshman;
    }
}

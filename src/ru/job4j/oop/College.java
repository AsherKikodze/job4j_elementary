package ru.job4j.oop;

public class College {
    Freshman freshman = new Freshman();
    Student student = (Student) freshman;
    Object object = (Object) student;
    Object object1 = (Object) freshman;
    Object object2 = freshman;
}

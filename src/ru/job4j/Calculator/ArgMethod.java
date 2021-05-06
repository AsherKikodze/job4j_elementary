package ru.job4j.Calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age +" years old");
    }


    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name);
        ArgMethod.hello(name,age);
    }
}

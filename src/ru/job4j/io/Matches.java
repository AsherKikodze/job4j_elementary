package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean turn = true;
        int count = 11;
        System.out.println("Игра 11.");
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            int matches = 0;
            while (!(matches == 1 || matches == 2 || matches == 3)) {
                System.out.println(player + " введите число от 1 до 3:");
                matches = Integer.parseInt(input.nextLine());
                if (!(matches == 1 || matches == 2 || matches == 3)) {
                    System.out.println("Число должно быть 1 или 2 или 3 !!!");
                }
            }
            count -= matches;
            turn = !turn;
            System.out.println("Осталось " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}

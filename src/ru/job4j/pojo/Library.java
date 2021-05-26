package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book hemi = new Book("Старик и море", 30);
        Book plat = new Book("Сокровенный человек", 320);
        Book wolf = new Book("Домой возврата нет", 415);
        Book clean = new Book("Clean code",680);
        Book[] lib = {hemi, plat, wolf, clean};
        for (Book i : lib) {
            System.out.println(i.getName() + " - " + i.getPages());
        }
        System.out.println("=============");
        Book pr = lib[0];
        lib[0] = lib[3];
        lib[3] = pr;
        for (Book i : lib) {
            System.out.println(i.getName() + " - " + i.getPages());
        }
        System.out.println("=============");
        for (Book i : lib) {
            if (i.getName().equals("Clean code")) {
                System.out.println(i.getName() + " - " + i.getPages());
            }
        }

    }
}

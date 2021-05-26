package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book hemi = new Book("Старик и море",30);
        Book plat = new Book("Сокровенный человек",320);
        Book wolf = new Book("Домой возврата нет",415);
        Book clean = new Book("Clean code",680);
        Book[] lib = {hemi, plat, wolf, clean};
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getPages());
        }
        System.out.println("=============");
        Book pr = lib[0];
        lib[0] = lib[3];
        lib[3] = pr;
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getPages());
        }
        System.out.println("=============");
        for (int i = 0; i < lib.length; i++) {
            if (lib[i].getName().equals("Clean code")) {
                System.out.println(lib[i].getName() + " - " + lib[i].getPages());
            }
        }

    }
}

package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {
        String res;
        switch (day) {
            case 1:
                res =  "Понедельник";
                break;
            case 2:
                res =  "Вторник";
                break;
            case 3:
                res =   "Среда";
                break;
            case 4:
                res =   "Четверг";
                break;
            case 5:
                res =   "Пятница";
                break;
            case 6:
                res =   "Суббота";
                break;
            case 7:
                res =   "Воскресенье";
                break;
            default:
                res = "Ошибка";
                break;
        }

        return res;
    }

    public static void main(String[] args) {
        String dayWeek = SwitchWeek.nameOfDay(2);
        System.out.println(dayWeek);

    }
}

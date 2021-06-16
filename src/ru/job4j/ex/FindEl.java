package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("String " + key + " not found");
    }

    public static void main(String[] args) {
        String[] str = {"Hi world", "My flower"};
        try {
            int n = indexOf(str, "Hi wor");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

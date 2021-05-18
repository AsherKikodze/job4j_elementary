package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean res = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - post.length + i] != post[i]) {
                res = false;
                break;
            }
        }
        return res;
    }
}

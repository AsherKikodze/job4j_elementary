package ru.job4j.poly;

public interface Transport {
    void toMove();

    void passengers(int number);

    double toLoad(int fuel);
}

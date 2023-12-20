package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int max = first > second ? first : second;
        return third > max ? third : max;
    }
}
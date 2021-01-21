package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second) {
            result = second;
        }
        if (second < third) {
            result = third;
        }
        return result;
    }
}
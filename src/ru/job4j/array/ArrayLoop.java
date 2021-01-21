package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2 + 3;
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}
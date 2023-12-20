package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        if (change > 0) {
            for (int coin : coins) {
                while (change - coin >= 0) {
                    change -= coin;
                    rsl[size] = coin;
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
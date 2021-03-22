package ru.job4j.lambda;

import java.util.Comparator;

import static java.util.Arrays.sort;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] numbers = {
                "O",
                "OO",
                "OOO",
                "OOOO",
                "OOOOO"
        };

        for (String s : numbers) {
            System.out.println(s);
        }

        sort(numbers, (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        });

        for (String s : numbers) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        String[] names = {
                "Ivan",
                "Petr"
        };

        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        sort(names, lengthCmp);
    }
}
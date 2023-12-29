package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int minus(int a) {
        return a - x;
    }

    public static int sum(int a) {
        return a + x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return minus(a) + sum(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        int size = 10;
        size = 100;
        size = size - 5;

        System.out.println(minus(10));
        System.out.println(sum(20));
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(30));
        System.out.println(calc.divide(40));
        System.out.println(calc.sumAllOperation(50));
    }
}
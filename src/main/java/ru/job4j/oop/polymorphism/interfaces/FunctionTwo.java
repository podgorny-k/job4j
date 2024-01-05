package ru.job4j.oop.polymorphism.interfaces;

public interface FunctionTwo extends FunctionOne {
    default double function(double x, double y) {
        return x * x - y + 5;
    }

    default void functionMessage() {
        System.out.println("Сообщение из FunctionTwo");
    }
}
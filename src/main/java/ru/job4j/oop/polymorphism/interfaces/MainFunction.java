package ru.job4j.oop.polymorphism.interfaces;

public class MainFunction implements FunctionOne, FunctionTwo {
    @Override
    public double function(double x, double y) {
        return FunctionTwo.super.function(x, y);
    }
}
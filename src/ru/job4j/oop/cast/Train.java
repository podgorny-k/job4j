package ru.job4j.oop.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по рельсам");
    }

    @Override
    public void countOfWheels() {
        System.out.println(getClass().getSimpleName() + " имеет 1000 колес");
    }
}
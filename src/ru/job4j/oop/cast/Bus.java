package ru.job4j.oop.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по дороге");
    }

    @Override
    public void countOfWheels() {
        System.out.println(getClass().getSimpleName() + " имеет 6 колес");
    }
}
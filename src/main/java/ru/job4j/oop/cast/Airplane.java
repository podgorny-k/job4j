package ru.job4j.oop.cast;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает в небе");
    }

    @Override
    public void countOfWheels() {
        System.out.println(getClass().getSimpleName() + " имеет 3 колеса");
    }
}
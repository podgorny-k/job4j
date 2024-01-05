package ru.job4j.oop.polymorphism.interfaces.cars;

public interface Vehicle extends Fuel {

    void accelerate();

    void brake();

    void steer();

    void changeGear();
}
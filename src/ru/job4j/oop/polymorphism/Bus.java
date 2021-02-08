package ru.job4j.oop.polymorphism;

public class Bus implements Transport {

    int occupiedPlaces;
    int speed;

    @Override
    public void drive() {
        speed = 45;
    }

    @Override
    public void passengers(int peoples) {
        occupiedPlaces += peoples;
    }

    @Override
    public int fillUp(int vol) {
        return 50 * vol;
    }
}
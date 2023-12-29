package ru.job4j.oop.inheritance.pizza;

public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return super.name() + " + Extra Cheese";
    }
}
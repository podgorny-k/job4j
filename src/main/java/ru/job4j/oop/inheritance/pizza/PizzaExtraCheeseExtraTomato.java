package ru.job4j.oop.inheritance.pizza;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + " + Extra Tomato";
    }
}
package ru.job4j.oop.enumeration;

public class Order {
    private int number;
    private String car;
    private Status status;

    public Order(int number, String car, Status status) {
        this.number = number;
        this.car = car;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public String getCar() {
        return car;
    }

    public Status getStatus() {
        return status;
    }
}
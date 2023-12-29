package ru.job4j.oop.inheritance.record;

public record PersonRecord(String name, int age) {
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}

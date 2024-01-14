package ru.job4j.oop.inheritance.hiding;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.instanceInvoke();
        cat.instanceInvoke();

        Animal.staticInvoke();
        Cat.staticInvoke();
    }
}
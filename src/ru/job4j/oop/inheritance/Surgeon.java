package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void operate() {
    }
}
package ru.job4j.oop.inheritance;

public class Engeneer extends Profession {
    public Engeneer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Project construct() {
        return new Project();
    }
}
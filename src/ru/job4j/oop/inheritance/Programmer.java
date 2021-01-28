package ru.job4j.oop.inheritance;

public class Programmer extends Engeneer {
    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Soft codding(Project project) {
        return new Soft();
    }
}
package ru.job4j.oop.inheritance;

public class Builder extends Engeneer {
    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void build(House house) {
    }
}
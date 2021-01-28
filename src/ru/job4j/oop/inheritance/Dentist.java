package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void treatTeeth() {
    }
}
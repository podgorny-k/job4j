package ru.job4j.oop.encapsulation;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Васянов Васян Васянович");
        student.setGroup("404");
        student.setDate(new Date());

        System.out.println("Студент: " + student.getFio() + ", группа: " + student.getGroup()
                + ", дата поступления: " + student.getDate());
    }
}
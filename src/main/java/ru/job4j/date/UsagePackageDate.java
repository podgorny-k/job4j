package ru.job4j.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования: " + currentDateTime);

        String currentDateTimeFormat = currentDateTime.format(FORMATTER);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
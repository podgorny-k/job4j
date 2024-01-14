package ru.job4j.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsagePackageDate {
/*  1. LocalDate - предназначен для отображения даты (год, месяц, день (yyyy-MM-dd))
    2. LocalTime - предназначен для отображения времени (час, минуты, секунды и наносекунды (HH-mm-ss-ns))
    3. LocalDateTime - предназначен для отображения даты и времени (yyyy-MM-dd-HH-mm-ss-ns)*/

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования: " + currentDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(dateTimeFormatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

        System.out.println("Текущая дата: " + LocalDate.now());

        System.out.println("Текущее время: " + LocalTime.now());

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Текущее время (HH:mm): " + LocalTime.now().format(timeFormatter));

        System.out.println("---");

        Date date = new Date();

        SimpleDateFormat simpTimeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Текущее время (hh:mm:ss): " + simpTimeFormat.format(date));

        SimpleDateFormat simpTimeWithoutSec = new SimpleDateFormat("kk:mm");
        System.out.println("Текущее время (kk:mm): " + simpTimeWithoutSec.format(date));
    }
}
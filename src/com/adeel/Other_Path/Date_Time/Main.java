package com.adeel.Other_Path.Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // How to work with DATES & TIMES using JAVA
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now(); // Class with private constructor
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);


        // Custom format
        LocalDateTime dateTime1 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);

        System.out.println(newDateTime);


        // Custom date and time
        LocalDate date1 = LocalDate.of(2025,3,23);
        System.out.println(date1);

        LocalTime time1 = LocalTime.of(03,30,01);
        System.out.println(time1);

        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);

        LocalDateTime dateTime3 = LocalDateTime.of(2025,01,01,01,30,33);
        System.out.println(dateTime3);

        // Compare dates and time
        if(dateTime2.isBefore(dateTime3)) {
            System.out.println(dateTime3 + " is earlier than " + dateTime3);
        } else if (dateTime2.isAfter(dateTime3)) {
            System.out.println(dateTime2 + " is later than " + dateTime3);
        } else if (dateTime2.isEqual(dateTime3)) {
            System.out.println(dateTime2 + " is equal to " + dateTime3);
        }

    }
}

/*

Rule you can remember 🧠
If you see ClassName.method() returning an object
👉 it’s either:
an interface via factory
or a class with private constructor

 */
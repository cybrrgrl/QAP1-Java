package com.date;


public class TestDate {
    public static void main(String[] args) {
        // Date object goes here
        Date date = new Date(5, 8, 2024);

        // displays the date using toString() method
        System.out.println("Original Date: " + date);

        // Modifying the date
        date.setDay(15);
        date.setMonth(10);
        date.setYear(2030);

        // the modified date
        System.out.println("Updated Date: " + date);
    }
}


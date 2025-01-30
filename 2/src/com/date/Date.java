package com.date;


public class Date {
    private int day;
    private int month;
    private int year;

    // Construction
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // gets the day, month, year
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // sets day month and year accordingly
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // set the full date at once
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // toString method to format date as "dd/mm/yyyy"
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}


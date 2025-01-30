package com.time;


public class TestTime {
    public static void main(String[] args) {
        // time objects (1 and 2)
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // original time display
        System.out.println("Initial Times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Calling nextSecond() on t1 and previousSecond() on t2 just how Time.java does
        t1.nextSecond();
        t2.previousSecond();

        // Displaying final times after changes
        System.out.println("\nAfter nextSecond() on t1 and previousSecond() on t2:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}

/*
32.Write a Java method to display the current date and time.
 */
package com.infodev.function;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class CurrentDateTime {
    /**
     * Displays current date
     */
    public static void displayCurrentDate(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Current date: "+df.format(date));
    }
    /**
     * Displays current time
     */
    public static void displayCurrentTime(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Current time: "+df.format(time));
    }

    /**
     * Displays current date and time
     */
    public static void performTask() {
        displayCurrentDate();
        displayCurrentTime();
    }
}

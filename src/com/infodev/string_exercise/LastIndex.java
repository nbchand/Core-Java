/*
18. Write a Java program to get the last index of a string within a string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class LastIndex {
    /**
     * Prints last index of String array
     */
    public static void performTask() {
        String str = "Hello everyone. How are you?";
        String[] arr = str.split(" ");
        System.out.println("Last Indes: "+(arr.length-1));
    }
}

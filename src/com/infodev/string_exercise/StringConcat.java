/*
26.Write a Java program to concatenate a given string with itself a given number
of times.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class StringConcat {
    public static void performTask() {
        String str = "Hello";
        int iteration = 3;
        String result = "";
        for (int i = 0; i < iteration; i++) {
            result = result + str;
        }
        System.out.println("Result: " + result);
    }
}

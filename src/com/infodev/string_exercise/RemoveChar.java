/*
 25. Write a Java program to remove a specified character from a given string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class RemoveChar {
    /**
     * Remove a charater from the given String
     */
    public static void performTask() {
        String str = "Hello world";
        String result = "";
        System.out.println("Before: " + result);
        char c = 'w';
        for (Integer i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == c)) {
                result = result + str.charAt(i);
            }
        }
        System.out.println("After: " + result);
    }
}

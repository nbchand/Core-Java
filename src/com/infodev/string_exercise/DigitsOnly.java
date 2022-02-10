/*
24.Write a Java program to test if a given string contains only digits. Return true
or false.
*/
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class DigitsOnly {
    public static boolean containsDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints if a String only contains digits
     */
    public static void performTask() {
        String str = "111";
        System.out.println("Contains only digit: " + containsDigit(str));
    }
}

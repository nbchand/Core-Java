/*
22.Write a Java program to return a new string using every character of even
positions from a given string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class CharAtEven {
    /**
     * Returns String with characters at even position
     * @param str input string
     * @return changed String
     */
    public static String getStringWithEvenCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                //and char of that index
                result += str.charAt(i);
            }
        }
        return result;
    }

    /**
     * Displays String made up of String at even position
     */
    public static void performTask() {
        String str = "Hello world";
        System.out.println("String with char at even position is: " + getStringWithEvenCharacters(str));
    }
}

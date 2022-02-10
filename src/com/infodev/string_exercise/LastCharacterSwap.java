/*
80. Write a Java program to create a new string from a given string swapping the
last two characters of the given string. The length of the given string must be
two or more.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class LastCharacterSwap {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public static void performTask() {
        LastCharacterSwap obj = new LastCharacterSwap();
        String str1 = "string";
        System.out.println("The given strings is: " + str1);
        System.out.println("The string after swap last two characters are: " + obj.lastTwo(str1));
    }
}


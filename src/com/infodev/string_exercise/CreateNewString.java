/*
20.Write a Java program to create a new string after removing a specified
  character from a given string except the first and last position
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class CreateNewString {
    /**
     * Removes a character in a given string.
     */
    public static void performTask() {
        String str = "Hello world";
        Character c = 'w';
        String result = "";
        if (str.charAt(0) == c || str.charAt(str.length() - 1) == c) {
            System.out.println("can not create string by including first and last character.");
        } else {
            for (Integer i = 0; i < str.length(); i++) {
                if (!(str.charAt(i) == c)) {
                    //concat all char expect user input char
                    result += str.charAt(i);
                }
            }
        }
        System.out.println("New String is: " + result);
    }

}

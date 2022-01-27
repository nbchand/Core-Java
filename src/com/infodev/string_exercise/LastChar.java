/*
1. Write a program to take a string input and display its length and last character.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/27/2022
 */
public class LastChar {
    /**
     * Displays the length of a String and displays the last character of that String
     * @param item String whose length and last character need to be found
     */
    public static void performTask(String item) {
        //calculates the length of the String which means no. of characters in the String
        int len = item.length();
        //prints length of the String
        System.out.println("The length of "+item+" is "+len);
        //last character of the String is character having index as (length of String-1)
        char lastChar = item.charAt(len-1);
        //prints last character of the String
        System.out.println("The last character of "+item+" is '"+lastChar+"'");
    }
}

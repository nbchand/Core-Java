/*
4. Write a program that takes the string input and reverse the string and display it.
 */
package com.infodev.string_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class StringReverse {
    /**
     * Takes a String as input and prints its reverse
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String:");
        //input taken
        String input = scanner.nextLine();

        //new StringBuilder object created which has our input String as its content
        StringBuilder str = new StringBuilder(input);

        //reverse of the String is shown using StringBuilder.reverse() method
        System.out.println("Reverse of the String is: "+str.reverse());

        scanner.close();
    }
}

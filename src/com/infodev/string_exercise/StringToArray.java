/*
3. Write a program that takes a string input and find distinct characters in string
and keep it in array.
Eg : apple The array should contain ‘apple’ only and print it.
 */
package com.infodev.string_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class StringToArray {
    /**
     * Saves each character of the String to an array and displays the result in the array
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a String:");
        String input = scanner.nextLine();

        //main logic, converts String to character array
        char[] arr = input.toCharArray();

        System.out.println("The characters of the String are now stored into a character array");
        System.out.println("The character array now contains: "+String.valueOf(arr));
        scanner.close();
    }
}

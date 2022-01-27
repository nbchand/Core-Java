/*
2. Write a program to take two string as input and check whether they are equal or
not (Try
both equals and ignore case)
 */
package com.infodev.string_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/27/2022
 */
public class CheckEqual {
    /**
     * Compares two Strings and identifies whether they're equal or not ignoring their cases
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second String:");
        String str2 = scanner.nextLine();

        //equalsIgnoreCase() ignores the case of the String provided to the method
        //and compares its content to the content of the String who is calling the method
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Both the provided Strings are equal");
        }
        else {
            System.out.println("Both the Strings are not equal");
        }
        scanner.close();
    }
}

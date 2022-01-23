/*
18. Write a program to check whether the number or string is palindrome or not.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class Palindrome {
    /**
     * Checks whether the input string is palindrome or not
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or a string:");
        String input = scanner.nextLine();
        String reversedString = "";

        //loop to create a reversed string
        for(int i=(input.length()-1);i>=0;i--){
            reversedString = reversedString + input.charAt(i);
        }

        //if reversed string is equal to input string, it is palindrome otherwise not
        if(input.equalsIgnoreCase(reversedString)){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }
        scanner.close();
    }
}

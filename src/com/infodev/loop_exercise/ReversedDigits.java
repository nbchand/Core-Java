/*
6. Write a program that prompts the user to input an integer and then outputs the number with
the digits reversed. For example, if the input is 12345, the output should be 54321.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class ReversedDigits {
    /**
     * Takes a number as input and displays a number formed by reversing the digits of input
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        //takes input from user
        System.out.println("Please enter a natural number:");
        int num = scanner.nextInt();
        //checks if the number is positive or not
        if(num<=0){
            System.out.println("Please enter a positive number");
            return;
        }
        //assigns the input integer to String
        String numString = String.valueOf(num);
        int len = numString.length();
        String reversedString = "";

        //creates the reversed String
        for(int i=(len-1);i>=0;i--){
            reversedString = reversedString+numString.charAt(i);
        }
        //converts the reversed String to Integer
        int reversedNum = Integer.parseInt(reversedString);
        //displays the result
        System.out.println("The reversed number is: "+reversedNum);

        scanner.close();
    }
}

/*
4. Write a program to find the factorial value of any number entered through the keyboard.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class Factorial {
    /**
     * Finds the factorial value of any number entered through the keyboard
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        //initializes variable for future use
        int fact = 1;
        //loop to calculate factorial
        for(int i=num;i>0;i--){
            fact = fact*i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
        scanner.close();
    }
}

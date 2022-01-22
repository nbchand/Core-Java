/*
5. Two numbers are entered through the keyboard. Write a program to find the value of one
number raised to the power of another. (Do not use Java built-in method)
 */
package com.infodev.loop_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class Power {
    /**
     * Takes two numbers as input and displays the result of one to the power of another.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        int result = 1;

        //logic for one number as power to another using loop
        for(int i=1;i<=b;i++){
            result = result*a;
        }
        System.out.println(a+" to the power "+b+" gives "+result);
        scanner.close();
    }
}

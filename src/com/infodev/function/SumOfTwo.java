/*
19.Write a program to print the sum of two numbers entered by users defining your
own method.
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class SumOfTwo {
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Takes two numbers as input as prints their sum
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + getSum(num1, num2));
    }
}

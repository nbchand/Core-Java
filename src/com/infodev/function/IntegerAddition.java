/*
41.Create a simple java method to read integers from users and manipulate that
data(like addition).
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class IntegerAddition {
    /**
     * Takes two numbers as input and displays their sum
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        scanner.close();
    }
}

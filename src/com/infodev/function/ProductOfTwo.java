/*
3. Define a method that returns the product of two numbers entered by the user.
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class ProductOfTwo {
    public static int product(int a, int b) {
        return a * b;
    }

    /**
     * Calculates product of two numbers
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("The product is " + product(a, b));
        scanner.close();
    }
}

/*
2. Write a program with a method named getTotal that accepts two integers as an
argument and return its sum. Call this method from main( ) and print the results.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class TotalOfTwo {
    public static int getTotal(int a, int b) {
        return a + b;
    }

    /**
     * Calculates sum of two numbers
     */
    public static void performTask() {
        int num1 = 5, num2 = 6;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + getTotal(5, 6));
    }
}

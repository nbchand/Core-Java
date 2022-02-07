/*
25. Write a method to find gcd using recursion.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class GCDByRecursion {
    public static int getGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }

        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return getGCD(num1 - num2, num2);
        }
        return getGCD(num1, num2 - num1);
    }

    /**
     * Prints the Greatest common divisor of the given two numbers
     */
    public static void performTask() {
        int num1 = 36, num2 = 144;
        System.out.println("The Greatest Common Divisor of " + num1 + " and " + num2 + " is " + getGCD(num1, num2));
    }
}

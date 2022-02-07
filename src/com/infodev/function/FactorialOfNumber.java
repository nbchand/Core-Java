/*
6. Write a program to print the factorial of a number by defining a method
getFactorial(int number).
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class FactorialOfNumber {
    public static int getFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Calculates factorial of number
     */
    public static void performTask() {
        int num = 5;
        System.out.println("The factorial of " + num + " is " + getFactorial(num));
    }
}

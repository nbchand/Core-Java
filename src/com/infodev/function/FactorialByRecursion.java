/*
24. Write a method to find factorial using recursion.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class FactorialByRecursion {
    public static int getFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return (num * getFactorial(num - 1));
        }
    }
    /**
     * Prints the factorial of given number
     */
    public static void performTask() {
        int num = 5;
        System.out.println("The factorial of " + num + " is: " + getFactorial(num));
    }
}

/*
18. Define two methods to print the maximum and minimum number respectively
among three numbers entered by the user.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class MaxAndMin {
    public static void printMaximum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Maximum number is " + a);
        } else if (b > c) {
            System.out.println("Maximum number is " + b);
        } else {
            System.out.println("Maximum number is " + c);
        }
    }
    public static void printMinimum(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Minimum number is " + a);
        } else if (b < c) {
            System.out.println("Minimum number is " + b);
        } else {
            System.out.println("Minimum number is " + c);
        }
    }

    /**
     * Prints minimum and maximum in given three numbers
     */
    public static void performTask() {
        printMaximum(6,7,8);
        printMinimum(6,7,8);
    }
}

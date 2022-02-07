/*
8. Create a function called sum(int num1 , int num2 , int num3) and inside the
function return the sum of three numbers and display it in the part from where the
function was called.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class SumOfThree {
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Displays sum of three numbers
     */
    public static void performTask() {
        System.out.println("The sum of 5, 6 and 7 is " + sum(5, 6, 7));
    }
}

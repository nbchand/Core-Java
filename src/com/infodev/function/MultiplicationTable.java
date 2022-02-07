/*
14.WAP to print the multiplication table of a number using a function
printMultiplication(int inputNumber)
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class MultiplicationTable {
    public static void printMultiplication(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }

    /**
     * Prints multiplication table of a number
     */
    public static void performTask() {
        printMultiplication(17);
    }
}

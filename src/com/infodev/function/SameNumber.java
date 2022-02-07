/*
17.Create a function that returns true when both the parameters are equal else return
false. isSameNum(4, 8) ➞ false
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class SameNumber {
    /**
     * Checks if two numbers are same
     */
    public static boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    /**
     * Prints if two numbers are same
     */
    public static void performTask() {
        System.out.println(isSameNum(4, 8));
    }
}

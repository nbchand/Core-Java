/*
15.WAP a java program that takes a number and returns the length of the number.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class DigitsInNum {
    public static int getLengthOfNum(int num) {
        String str = String.valueOf(num);
        return str.length();
    }

    /**
     * Finds length of a number
     */
    public static void performTask() {
        int num = 500;
        System.out.println("Length of " + num + " is " + getLengthOfNum(num));
    }
}

/*
9. WAP to check whether a number is even or odd using function. The function name
should be isEven(int parameter), which returns true if the number is even and
return false if the number is odd
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class CheckEven {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks whether a number is even or odd
     */
    public static void performTask() {
        int num = 5;
        if (isEven(num)) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}

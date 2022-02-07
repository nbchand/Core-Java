/*
7. Create a function called averageNumber(int num1 , int num2 , int num3) and
inside the function display the highest and lowest among three numbers.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class HighestLowestInThree {
    public static void averageNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is smaller");
        } else if (num2 < num3) {
            System.out.println(num2 + " is smaller");
        } else {
            System.out.println(num3 + " is smaller");
        }
    }

    /**
     * Prints smallest and largest among three numbers
     */
    public static void performTask() {
        int a = 5, b = 4, c = 3;
        averageNumber(a, b, c);
    }
}

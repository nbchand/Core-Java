/*
25. Find the factorial of the largest number in an array.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class LargestElementFactorial {
    /**
     * Finds the factorial of the largest number in an array.
     */
    public static void performTask() {
        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        //finds maximum number
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //finds factorial of maximum number
        int fact = 1, i;
        for (i = max; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial of the largest number in our array is " + fact);
    }
}

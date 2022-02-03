/*
17. Find the occurrence of an integer in the array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class IntegerOccurrence {
    /**
     * Finds the occurrence of an element inside an array
     */
    public static void performTask() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 1, 2, 1, 2, 3, 4, 5, 6};
        int ourInt = 2;
        System.out.println("Our array is " + Arrays.toString(arr));
        int count = 0;
        //loop to find the occurance
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ourInt) {
                count++;
            }
        }
        System.out.println("The element " + ourInt + " occurs " + count + " times in our array.");
    }
}

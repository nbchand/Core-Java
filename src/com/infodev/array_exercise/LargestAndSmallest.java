/*
12.WAP to find the largest and smallest element in the array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;
/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class LargestAndSmallest {
    /**
     * Identify minimum and maximum elements present in an array and print them.
     */
    public static void performTask() {
        int arr[] = {6, 43, 12, 45, 87, 23, 19, 4, 3, 68};
        //it is the maximum value an integer can hold in java
        int min = 2147483647;
        //it is the minimum value an integer can hold in java
        int max = -2147483648;
        //loop to compare each element with minimum and maximum value
        for (int i = 0; i < arr.length; i++) {
            //if element is greater than maximum value, assign the element to the maximum value
            if (arr[i] > max) {
                max = arr[i];
            }
            //if element is smaller than minimum value, assign the element to the minimum value
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //prints the results
        System.out.println("Our array is " + Arrays.toString(arr));
        System.out.println("The maximum element in the array is " + max);
        System.out.println("The minimum element in the array is " + min);
    }
}

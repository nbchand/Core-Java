/*
15. Wap to reverse the array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class ReverseArray {
    /**
     * Reverses an array and displays it
     */
    public static void performTask() {
        int[] arr = {-13, 4, 55, 8, 67, -90, 11, -15, 72, 31};
        System.out.println("Before reverse " + Arrays.toString(arr));
        //new array to store elements in reverse order
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[arr.length - 1 - i] = arr[i];
        }
        //assign the new array to old array
        arr = reverseArr;
        System.out.println("After reverse " + Arrays.toString(arr));
    }
}

/*
27. Find maximum sum subarray
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class MaxSubArray {
    /**
     * Finds the maximum sum subarray
     */
    public static void performTask() {
        int[] arr = {3, 4, -3, 7, -2, 2, 4, 5};
        int maxSum = arr[0];
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("The maximum possible sum of sub-array is " + maxSum);
    }
}

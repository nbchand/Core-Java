/*
26. Find maximum product subarray.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class MaxProductOfSubArray {
    public static int getMaximumProductOfSubArray(int[] array) {
        int maxProduct = array[0];
        for (int i = 0; i < array.length; i++) {
            int product = array[i];
            for (int j = 1 + i; j < array.length; j++) {
                maxProduct = Math.max(maxProduct, product);
                product = product * array[j];
            }
            maxProduct = Math.max(maxProduct, product);
        }
        return maxProduct;
    }

    /**
     * Finds the maximum product subarray
     */
    public static void performTask() {
        int[] array = {4, 2, -6, -8, 10};
        System.out.println("The maximum product subarray:" + getMaximumProductOfSubArray(array));
    }
}

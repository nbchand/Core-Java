/*
24. Find if there is any subarray with sum equal to zero.
 */
package com.infodev.array_exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class SubArrayWithZeroSum {
    /**
     * Checks if any sub array has equal sum or not
     * @param array parent array
     * @return true if subarray has 0 sum otherwise false
     */
    public static boolean isSubArraySumZero(int[] array) {
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        //traverse all elements
        for (int i = 0; i < array.length; i++) {
            //calculates sum
            sum += array[i];
            //return true if
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map, this means there are some elements in between which cancel each other
            // as a result sum is constant or repeated
            if (array[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    /**
     * Prints if the array has a sub array with sum = 0 or not
     */
    public static void performTask() {
        int arr[] = {1,2,3,-1,4,5,6};
        if (isSubArraySumZero(arr)) {
            System.out.println("Yes, the array has a sub array with sum equal to zero");
        } else {
            System.out.println("No, the array doesn't have a sub array with sum equal to zero");
        }
    }
}

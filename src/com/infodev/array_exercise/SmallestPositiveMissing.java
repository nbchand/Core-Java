/*
30. Find the smallest positive missing number.
Example:
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class SmallestPositiveMissing {
    /**
     *  Finds the smallest positive missing number in an array
     */
    public static void performTask() {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        //sorts array
        Arrays.sort(arr);
        //initializes number as the maximum number + 1
        int num = arr.length + 1;
        //traverse array backward
        for (int i = arr.length - 1; i >= 0; i--) {
            //if given index doesn't contain a number which is (index+1), assign it to num
            if (arr[i] != (i + 1)) {
                num = (i + 1);
            }
        }
        System.out.println("Smallest positive missing number is " + num);
    }
}

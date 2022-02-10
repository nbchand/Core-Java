/*
22. Find the first non-repeating element in a given array of integers.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class FirstNonRepeating {
    /**
     * Finds first non-repeating element in an array
     */
    public static void performTask() {
        int result = -1;
        int j;
        int arr[] = {1, 2, 1, 2, 3, 4, 5};
        //traverse all the elements
        for (int i = 0; i < arr.length; i++) {
            //traverse all the elements
            for (j = 0; j < arr.length; j++) {
                //condition for repetition of element is index must not be same and elements must be same
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            //if j == arr.length, it means the match for a[i] is not found so, it is unique
            if (j == arr.length) {
                result = arr[i];
                break;
            }
        }
        System.out.println("The first non repeating element in the array is: " + result);
    }
}

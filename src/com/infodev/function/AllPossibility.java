/*
37.A non-empty array A of length n is called an array of all possibilities if it
contains all numbers between 0 and A.length-1 inclusive. Write the method
named isAllPossibilities that accepts an integer array and returns 1 if the
array is an array of all possibilities, otherwise it returns 0.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class AllPossibility {
    /**
     * Checks the possibility of given array
     *
     * @param arr array to be inspected
     * @return 1 if array is valid otherwise 0
     */
    public static int isAllPossibilities(int arr[]) {
        //checks whether the number is between zero and array length or not
        for (int a : arr) {
            if (a < 0 && a > arr.length) {
                return 0;
            }
        }
        //checks whether the elements are repeating or not
        if (isElementRepeating(arr)) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Checks whether an array has at-least a single repeating number or not
     *
     * @param arr array to be inspected
     * @return true if any element is repeated otherwise false
     */
    public static boolean isElementRepeating(int arr[]) {
        //first loop to extract element at an index
        for (int i = 0; i < arr.length; i++) {
            //second loop to extract element at greater index than the first number
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks whether an array has all the possibilities or not
     */
    public static void performTask() {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        if (isAllPossibilities(arr) == 1) {
            System.out.println("It is the array of all the possibilities");
        } else {
            System.out.println("It is not the array of all the possibilities");
        }
    }
}

/*
36. Write a java program to find the second-smallest element in an array.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class SecondSmallestElement {
    /**
     * Finds the second-smallest element in an array
     */
    public static void performTask() {
        int arr[] = { 2, 3, 1, 4, 6, 8, 10 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second smallest element: " + arr[1]);
    }
}

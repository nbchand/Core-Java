/*
32. Write a java program to calculate the average value of array elements.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class AverageOfArray {
    /**
     * Prints average of an array
     */
    public static void performTask() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        float avg = (float) sum / (float) (arr.length);
        System.out.println("Average: " + avg);
    }
}


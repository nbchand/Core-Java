/*
11.WAP to sum and average the elements of any array. Size of the array
should be defined by the user and also input should be provided by the
user.
 */
package com.infodev.array_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class SumAndAverage {
    /**
     * Takes array as input and calculates sum as well as average of its elements
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you want to enter?");
        //takes length of array as input
        int length = scanner.nextInt();
        //initializes array
        int arr[] = new int[length];
        int sum = 0;
        //takes input for array elements and calculates sum of the inputs
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element no. " + (i + 1));
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        //calculates average
        float avg = (float) sum / length;
        //prints result
        System.out.println("The sum of elements is " + sum);
        System.out.println("The average of elements is " + avg);
        scanner.close();
    }
}

/*
10.WAP to create an integer array of size 10 , read the array elements from the
user and display the array elements.
 */
package com.infodev.array_exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class InputAndDisplay {
    /**
     * Takes 10 integers as input and stores them inside an array as well as displays the array.
     */
    public static void performTask() {
        //initializes an array of size 10
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        //takes 10 elements of array as input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter element no. " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        //displays the entire array as a String using Arrays.toString method
        System.out.println("The entered array is: " + Arrays.toString(arr));
        scanner.close();
    }
}

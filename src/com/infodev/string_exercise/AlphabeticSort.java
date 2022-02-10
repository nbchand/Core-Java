/*
11. Write a program to take a string input and sort it alphabetically.
 */
package com.infodev.string_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class AlphabeticSort {
    /**
     * Sorts a String alphabetically
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        System.out.println("Before sorting: " + str);
        char[] arr = str.toCharArray();
        int n = arr.length;
        //bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        str = String.valueOf(arr);
        System.out.println("After sorting: " + str);
        scanner.close();
    }
}

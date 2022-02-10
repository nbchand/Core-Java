/*
21. Find the first repeating element in an array of integers.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class FirstRepeating {
    /**
     * Finds the first repeating element in an array of integers.
     */
    public static void performTask() {
        int arr[] = {1, 2, 2, 3, 4, 5, 1, 2, 4};
        //outer loop to traverse all the elements
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            //inner loop to traverse all the elements coming after index i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First repeated element is " + arr[i]);
                    flag++;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
    }
}


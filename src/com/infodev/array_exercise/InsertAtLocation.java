/*
34. Write a java program to insert an element (specific position) into an array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class InsertAtLocation {
    /**
     * Inserts an element (specific position) into an array
     */
    public static void performTask() {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int Index_position = 2;
        int newValue = 5;

        System.out.println("Original Array : " + Arrays.toString(my_array));

        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }

        my_array[Index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(my_array));
    }
}


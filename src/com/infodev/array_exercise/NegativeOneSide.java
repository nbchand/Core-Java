/*
18. Move all the negative elements to one side of the array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class NegativeOneSide {
    /**
     * Uses bubble sort to sort an array and displays negative numbers at first
     */
    public static void performTask() {
        int[] arr = {-1, 1, -2, 2, -3, 3, -4, 4, -5, 5};
        System.out.println("Before sorting " + Arrays.toString(arr));
        int len = arr.length;
        //bubble sort
        for (int i = 0; i < len-1; i++) {
            for( int j = 0; j<len-i-1;j++){
                //if value of the element at current index is greater than that of the upcoming index then perform swapping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting " + Arrays.toString(arr));
    }
}

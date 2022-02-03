/*
16. Wap to sort the given array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class SortArray {
    /**
     * Uses bubble sort to sort an array
     */
    public static void performTask() {
        int[] arr = {-13, 4, 55, 8, 67, -90, 11, -15, 72, 31};
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

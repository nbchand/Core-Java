/*
23.Rearrange the array in alternating positive and negative items.
Example:
Input:
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
 */
package com.infodev.array_exercise;

import java.util.Arrays;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class OddEvenIndex {
    /**
     * Re-arranges array according to index.
     */
    public static void performTask() {
        int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        /*
        positive numbers and zero: must be at even index
        negative numbers: must be at odd index
         */
        System.out.println("Before: "+Arrays.toString(arr));
        //to traverse all the elements
        for (int i = 0; i < arr.length; i++) {
            //if odd index has positive numbers or zero OR if even index has negative numbers
            //then swap these numbers with the number of required sign
            if ((i % 2 == 1 && arr[i] >= 0) || (i % 2 == 0 && arr[i] < 0)) {
                //code for rearrange
                //if index is negative swap positive or zero element with upcoming negative number
                if (i % 2 == 1) {
                    int temp;
                    //loop to traverse upcoming numbers
                    for (int j = i + 1; j < arr.length; j++) {
                        //when required number is found perform swapping
                        if (arr[j] < 0) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
                //if index is positive swap negative element with upcoming positive number or zero
                else {
                    int temp;
                    //loop to traverse upcoming numbers
                    for (int j = i + 1; j < arr.length; j++) {
                        //when required number is found perform swapping
                        if (arr[j] >= 0) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }

            }
        }

        System.out.println("After: "+Arrays.toString(arr));
    }
}

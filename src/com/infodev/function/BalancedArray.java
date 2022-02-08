/*
40. An array is called balanced if it’s even number elements (a[0],a[2],etc.) are even
and its odd numbered elements (a[1],a[3],etc.) are odd. Write a function named
Balanced that accepts an array of integers and returns 1 if the array is balanced
otherwise it returns 0.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class BalancedArray {
    /**
     * Checks whether an array is balanced or not
     * @param arr integer array
     * @return 1 if array is balanced otherwise 0
     */
    public static int balanced(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 == 1) {
                    return 0;
                }
            } else {
                if (arr[i] % 2 == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    /**
     * Initializes an array and checks whether it is balanced or not.
     */
    public static void performTask() {
        int arr[] = {2,1,4,3,6,5,8,7,10,9};
        if(balanced(arr)==1){
            System.out.println("The array is balanced");
        }else {
            System.out.println("The array is not balanced");
        }
    }
}

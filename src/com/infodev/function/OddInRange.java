/*
11. WAP that displays all the odd numbers from range void displayOddNumbers(int
start , int end)
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class OddInRange {
    public static void displayOdd(int start, int end) {
        //if start of range is greater than end swap them
        if(start>end){
            int temp = start;
            start=end;
            end=temp;
        }
        for (int i = start; i <= end; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }

    /**
     * Displays odd numbers in a given range;
     */
    public static void performTask() {
        int num1 = 7, num2 = 18;
        displayOdd(num1, num2);
    }
}

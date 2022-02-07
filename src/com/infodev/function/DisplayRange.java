/*
10.WAP that displays all the numbers from range void display(int start , int end)
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class DisplayRange {
    public static void display(int start, int end) {
        //if start of range is greater than end swap them
        if(start>end){
            int temp = start;
            start=end;
            end=temp;
        }
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    /**
     * Displays numbers in a given range;
     */
    public static void performTask() {
        int num1 = 7, num2 = 18;
        display(num1, num2);
    }
}

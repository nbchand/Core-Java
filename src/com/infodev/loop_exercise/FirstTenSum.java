/*
2. Write a program to calculate the sum of the first 10 natural numbers.
 */
package com.infodev.loop_exercise;

/**
 * @author Narendra
 * @version 0.1
 */
public class FirstTenSum {
    /**
     * Prints the sum of first ten natural numbers
     */
    public static void performTask() {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum = sum+i;
        }
        System.out.println("The sum of first 10 natural numbers is: "+sum);
    }
}

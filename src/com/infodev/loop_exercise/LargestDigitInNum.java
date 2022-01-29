/*
19. Write a program to find the largest digit in a number. Example 12345 => output
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class LargestDigitInNum {
    /**
     * Finds the largest digit in a number
     */
    public static void performTask() {
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int num = scanner.nextInt();
        //user needs to provide a natural number
        if(num<=0){
            System.out.println("Entered number is not a natural number");
            return;
        }

        //converts integer to character array
        char[] arr = String.valueOf(num).toCharArray();

        //iterates n times, where n is the numbers of digits in the number
        for(int i=0; i<arr.length;i++){
            //separates every character in an array and converts it into integer
            int val = Character.getNumericValue(arr[i]);
            //checks if the seperated digit is maximum or not
            if(val>max){
                max=val;
            }
        }

        System.out.println("The largest digit in the number "+num+" is "+max);
        scanner.close();
    }
}

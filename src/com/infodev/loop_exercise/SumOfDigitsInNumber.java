/*
17. Write a program to find the sum of digits in a number. Example : 123 = (1+2+3)
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class SumOfDigitsInNumber {
    /**
     * Displays the sum of all the digits in the number
     */
    public static void performTask() {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int num = scanner.nextInt();

        if(num<=0){
            System.out.println(num+" is not a natural number");
            return;
        }

        //logic starts here
        //converts number into string
        String numString = String.valueOf(num);
        //iteration is performed n times, where n is the numbers of digits in the integer
        for(int i=0;i<numString.length();i++){
            //each character from the string is seperated
            char c = numString.charAt(i);
            //seperated character is then converted back to integer and sum is calculated
            sum = sum+Character.getNumericValue(c);
        }

        System.out.println("The sum of individual digits in number "+num+" is "+sum);
        scanner.close();
    }
}

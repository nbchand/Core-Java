/*
l) Take two values fromNumber and toNumber. Your program should print based on
following criteria
i) Both fromNumber and toNumber should be greater than or equal to 0.
ii) If fromNumber is less than toNumber then print all the numbers from
fromNumber to toNumber ; inclusive fromNumber and exclusive
toNumber
iii) If fromNumber is greater than toNumber, swap the numbers and perform
the same process as above.
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class FromAndToNumbers {
    /**
     * Takes two numbers as input and prints all the numbers
     * present between these two numbers including the first number
     * and excluding the last number.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        //takes both from number and to number as input
        System.out.println("Enter the value of from number:");
        int fromNumber = scanner.nextInt();
        System.out.println("Enter the value of to number:");
        int toNumber = scanner.nextInt();

        //checks if the numbers are greater than 0 or not
        if(fromNumber<0||toNumber<0){
            System.out.println("Both the numbers must be greater than 0");
            return;
        }
        //checks which number is greater
        if(fromNumber<toNumber){
            //displays all the number between fromNumber and toNumber
            displayNumbers(fromNumber,toNumber);
        }
        else if(fromNumber>toNumber){
            //displays all the number between toNumber and fromNumber
            displayNumbers(toNumber,fromNumber);
        }
        else {
            System.out.println("Both the numbers are equal");
        }
        scanner.close();
    }

    /**
     * Displays all the numbers between two numbers including the start number and excluding the end number
     * @param fromNumber start of the range
     * @param toNumber end of the range
     */
    public static void displayNumbers(int fromNumber,int toNumber){
        System.out.println("Numbers between "+fromNumber+" and "+toNumber+" including "+fromNumber+" and excluding "+toNumber+" are:");
        for(int i=fromNumber;i<toNumber;i++){
            System.out.println(i);
        }
    }
}

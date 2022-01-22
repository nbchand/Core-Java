//b) Write a java program to check if the input number is even or odd.

package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class EvenOdd {
    /**
     *  Checks if the input number is even or odd.
     */
    public static void performTask() {
        //scanner object instantiated
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number:");

        //input taken
        int num = scanner.nextInt();

        //executes if the number is zero
        if(num==0){
            System.out.println("0 is neither even nor odd");
        }
        //executes if the number is even
        else if(num%2==0){
            System.out.println(num+" is an even number");
        }
        //executes if the number is odd
        else{
            System.out.println(num+" is an odd number");
        }
        //closes the scanner
        scanner.close();
    }
}

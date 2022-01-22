//c) WAP to check if a number is positive or not.
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class PositiveNumber {
    /**
     *  Checks if a number is positive or not.
     */
    public static void performTask() {
        //scanner object instantiated
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        //takes a number as input
        int num = scanner.nextInt();
        //executes if the number is 0
        if(num==0){
            System.out.println("0 is neither positive nor negative");
        }
        //executes if the number is greater than 0
        else if(num>0){
            System.out.println(num+" is a positive number");
        }
        //executes if the number is less than 0
        else{
            System.out.println(num+" is a negative number");
        }
        //scanner closed
        scanner.close();
    }
}

//a) Write a java program to accept two integers and check whether they are equal or not.

package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class EqualInteger {
    /**
     *  Accepts two integers and checks whether they are equal or not.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        //using conditional statements to check the equality of two numbers
        if(firstNum==secondNum){
            System.out.println("Both the given numbers are equal");
        }
        else{
            System.out.println("Provided numbers are not equal");
        }
        //closing the scanner and free all the resources which the scanner is currently holding
        scanner.close();
    }
}

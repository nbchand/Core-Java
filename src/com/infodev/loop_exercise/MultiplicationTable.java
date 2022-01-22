/*
3. Write a program that prompts the user to input a positive integer. It should then print the
multiplication table of that number.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class MultiplicationTable {
    /**
     * Takes a number as input and displays its multiplication table.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int num = scanner.nextInt();
        //checks if the number is positive or not
        if(num<=0){
            System.out.println(num+" is not a positive number.");
            return;
        }
        System.out.println("\nMultiplication table of "+num+" is given below:");
        //prints multiplication table of the number upto 10
        for (int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
        scanner.close();
    }
}

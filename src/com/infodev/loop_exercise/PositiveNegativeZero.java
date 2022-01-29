/*
11. Write a program to enter the numbers till the user wants and at the end it should display the
count of positive, negative and zeros entered.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class PositiveNegativeZero {
    /**
     * Takes the input of numbers till the user wants and at the end displays the
     * count of positive, negative and zeros entered.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        //initialize the variables to store the count of numbers
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        System.out.println("Continuously enter a number or press 'q' to quit the process");

        //loop to take continuous input of numbers
        while (true){

            //takes input as String and store the first letter of String to a character variable
            String input = scanner.next();
            char value = input.toLowerCase().charAt(0);

            //checks if the first character of String is an alphabet or not
            if((int)value>=97 && (int)value<=122){
                //if the first alphabet is q, it will break the loop
                if(value=='q'){
                    break;
                }
            }

            //executes if the first character is not an alphabet
            else {
                //converts the String into an integer
                int num = Integer.parseInt(input);
                //checks if the number is positive
                if(num>0){
                    //increments positive count
                    positiveCount++;
                }
                //checks if the number is negative
                else if(num<0){
                    //increments negative count
                    negativeCount++;
                }
                //executes if the number is zero
                else{
                    //increments zero count
                    zeroCount++;
                }
            }
        }


        //displays the calculated count of the positive digits, negative digits and zeroes entered
        System.out.println("The count of positive numbers entered is: "+positiveCount);
        System.out.println("The count of negative numbers entered is: "+negativeCount);
        System.out.println("The count of zero entered is: "+zeroCount);

        scanner.close();
    }
}

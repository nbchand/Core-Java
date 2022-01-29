/*
12. Write a program to enter the numbers till the user wants and at the end the program should
display the largest and smallest numbers entered.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class LargestSmallest {
    /**
     * Takes the input of numbers till the user wants and at the end displays the
     * largest number entered as well as the smallest number entered.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        //initialize the variables to store maximum and minimum number
        //these values are the boundaries upto which an integer variable can hold data
        int max=-2147483648, min=2147483647;

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
                //executes if the number is greater than the maximum number
                if(num>max){
                    max=num;
                }
                //executes if the number is smaller than the maximum number
                if(num<min){
                    min=num;
                }

            }
        }


        //displays the maximum and minimum numbers entered
        System.out.println("The maximum number entered is: "+max);
        System.out.println("The minimum number entered is: "+min);

        scanner.close();
    }
}

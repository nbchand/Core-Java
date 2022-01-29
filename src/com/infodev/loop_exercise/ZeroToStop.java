/*
22. Write a program to print a string like “Enter a number ” into the console until the user enters
0 (zero) from the keyboard. The System.out.println() statement should not be written
outside the loop.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class ZeroToStop {
    /**
     * Prints a string until user presses 0
     */
    public static void performTask() {

        Scanner scanner = new Scanner(System.in);

        //loop to take continuous input from user
        while (true){
            System.out.println("Enter a number: ");
            //takes a string as input
            String input = scanner.nextLine();
            //executes if the entered string is zero
            if(input.equals("0")){
                break;
            }

        }

        scanner.close();
    }
}

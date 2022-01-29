/*
10. Write a do-while loop that asks the user to enter two numbers. The numbers should be added
and the sum displayed. The loop should ask the user whether he or she wishes to perform the
operation again. If so, the loop should repeat; otherwise it should terminate.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class SumUsingDoWhile {
    /**
     * Takes input of two numbers and prints their sum.
     * Iterates the process until user presses 'N' key from the keyboard.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        char input = 'y';
        //performs the input and summation of number at least once
        do{
            System.out.println("Enter first number:");
            int first = scanner.nextInt();

            System.out.println("Enter second number:");
            int second = scanner.nextInt();
            scanner.nextLine();

            System.out.println("The sum of "+first+" and "+second+" is "+(first+second));

            System.out.println("Do you want this process to continue?\nIf yes press any key from the keyboard otherwise press 'N' key.");
            String inputString = scanner.nextLine();
            input = inputString.toLowerCase().charAt(0);

        }while(input!='n');//terminates the loop when user presses 'N' from the keyboard
    }
}

/*
d) WAP to check if a person is eligible to cast a vote or not.
   PS. Make your own age bar for eligibility.
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class VotingEligibility {
    /**
     * Checks if a person is eligible to cast a vote or not.
     */
    public static void performTask() {
        //my age
        final int MY_AGE = 21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        //executes if user's age is greater than or equals to 21
        if(userAge>=MY_AGE){
            System.out.println("Congratulations! you are eligible to cast a vote.");
        }
        //executes if user's age is less than 21
        else{
            System.out.println("Sorry, you not are eligible to cast a vote. You must at least be 21 years old.");
        }
        scanner.close();
    }
}

/*
16. Write a program that generates a random number and asks the user to guess what the
number is. If the user's guess is higher than the random number, the program should display
"Too high, try again." If the user's guess is lower than the random number, the program
should display "Too low, try again." The program should use a loop that repeats until the
user correctly guesses the random number.
 */
package com.infodev.loop_exercise;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class RandomGuess {
    /**
     * Generates a random number and takes an input from user.
     * If user guesses the random number correctly program terminates otherwise the process continues
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        //instantiates the object of Random class which will generate a random integer for us
        Random random = new Random();
        //a random integer between 0-999 is generated
        int num = random.nextInt(1000);
        System.out.println("Guess a random number between 0 and 999");

        //loop continues until user guesses the random number correctly
        while (true){
            //user input is taken
            int guess = scanner.nextInt();
            if(guess>num){
                System.out.println("Too high, try again.");
            }
            else if(guess<num){
                System.out.println("Too low, try again.");
            }
            else{
                break;
            }
        }
        scanner.close();
    }
}

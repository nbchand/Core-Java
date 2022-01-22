/*
i) Write a program to take a character input from a keyboard and print whether it is
vowel or consonant.
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class VowelConsonant {
    /**
     *  Takes a character input from keyboard and prints whether it is
     *  a vowel or a consonant.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an alphabet:");
        String input = scanner.next();

        //checks if the input has a single character or not
        if(input.length()>1){
            System.out.println("Please enter a single character");
            return;
        }
        //converts the input string to uppercase then to a character datatype
        char alphabet = input.toUpperCase().charAt(0);

        //checks if the entered character is an alphabet or not using its ASCII value
        if( (int)alphabet>=65 && (int)alphabet<=90 ){
            //checks if the alphabet is vowel or not
            if(alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U'){
                System.out.println(input.charAt(0)+" is a vowel");
            }
            else{
                System.out.println(input.charAt(0)+" is a consonant");
            }
        }
        else{
            System.out.println("Entered character is not an alphabet");
        }
        scanner.close();
    }
}

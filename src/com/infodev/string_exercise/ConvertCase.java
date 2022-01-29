/*
8. Write a program to take string input and convert it to uppercase and lowercase
without using the String function. [ USE ASCII Concept ]
 */
package com.infodev.string_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class ConvertCase {
    /**
     * Takes string input and converts it to uppercase and lowercase
     * without using the String function
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a String:");
        //takes input
        String str = scanner.nextLine();

        //displays results
        System.out.println("Upper case: "+convertToUpperCase(str));
        System.out.println("Lower case: "+convertToLowerCase(str));


        scanner.close();
    }

    /**
     * Converts provided String into uppercase
     * @param str String whose case needs to be converted
     * @return Case converted String
     */
    public static String convertToUpperCase(String str){
        //new String to store the updated value
        String newString = "";

        //loop to perform operation on characters one by one
        for(char val: str.toCharArray()){
            //extract ascii value of the character
            int ascii = (int)val;
            //if the letter is of lower case convert it to upper case
            if(ascii>=97&&ascii<=122){
                val = (char)(ascii-32);
            }
            //concat updated character to the new String
            newString = newString+val;
        }
        return newString;
    }

    /**
     * Converts provided String into lowercase
     * @param str String whose case needs to be converted
     * @return Case converted String
     */
    public static String convertToLowerCase(String str){
        //new String to store the updated value
        String newString = "";

        //loop to perform operation on characters one by one
        for(char val: str.toCharArray()){
            //extract ascii value of the character
            int ascii = (int)val;
            //if the letter is of upper case, convert it to lowercase
            if(ascii>=65&&ascii<=90){
                val = (char)(ascii+32);
            }
            //concat updated character to the new String
            newString = newString+val;
        }
        return newString;
    }
}

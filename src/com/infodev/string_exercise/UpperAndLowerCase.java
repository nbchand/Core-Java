/*
6. Write a program to find the number of uppercase and lower case characters in a
string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class UpperAndLowerCase {
    /**
     * Find the numbers of upper and lower case characters in provided String
     * @param str String whose upper and lower case letter numbers need to be calculated
     */
    public static void performTask(String str) {

        //initialize variables to store the count of the letters
        int upperCount = 0, lowerCount = 0;

        //loop to compare ascii value of each character
        for(char val: str.toCharArray()){
            //find the ascii value of current character
            int ascii = (int)val;
            //if the ascii value of the character is between 97-122, it is a lowercase letter
            if(ascii>=97&&ascii<=122){
                lowerCount++;
            }
            //if the ascii value of the character is between 65-90, it is a uppercase letter
            else if(ascii>=65&&ascii<=90){
                upperCount++;
            }
        }

        System.out.println("No. of uppercase letters in \""+str+"\" : "+upperCount);
        System.out.println("No. of lowercase letters in \""+str+"\" : "+lowerCount);
    }
}

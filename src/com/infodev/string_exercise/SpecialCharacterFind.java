/*
7. Write a program to find the special characters in the string. Special characters
includes !@#$
%^&*()”:>? sur$$$tttt@#$%
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class SpecialCharacterFind {
    /**
     * Finds special character in the given String
     */
    public static void performTask() {
        //provided in the question
        String givenString = "%^&*()”:>? sur$$$tttt@#$%";
        String special = "";
        //loop to compare each character of the String
        for(char val: givenString.toCharArray()){
            //checks if the current character is a special character or not
            if(val=='!'||val=='@'||val=='#'||val=='$'){
                special = special+val;
            }
        }

        System.out.println("The special characters in the given String are: "+special);
    }
}

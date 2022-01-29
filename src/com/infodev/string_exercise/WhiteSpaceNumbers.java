/*
5. Write a program to find the number of white spaces used in a string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class WhiteSpaceNumbers {
    /**
     * Displays the number of whitespaces present in a String
     * @param str String whose no. of whitespaces need to be calculated
     */
    public static void performTask(String str) {

//        //splits the String into String array using split()
//        String arr[] = str.split(" ");
//        //now count of the white spaces will be (no. of Strings spawned after splitting-1)
//        int count = (arr.length-1);
//        //prints the no. of whitespaces
//        System.out.println("The number of white spaces in the String are: "+count);

        /*
        the above method failed for the conditions like str = "hello world  "
        the result was 1, but it had to be 3
         */

        //initialize initial space count as 0
        int count = 0;
        //loop to check each character of the String
        for(char val: str.toCharArray()){
            //check whether the given character is a white space or not
            if(val==' '){
                //if the character is a whitespace increase the count
                count++;
            }
        }
        //printing the no. of whitespaces
        System.out.println("The number of white spaces in the String are: "+count);
        /*
        the above method works for the conditions like str = "hello world  "
        as it checks each and every character. Complexity increases but the goal is achieved.
         */
    }
}

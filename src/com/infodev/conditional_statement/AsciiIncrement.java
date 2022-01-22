/*
m) Take a string input from the user and display the same string incrementing the
ascii value by 1. You should exclude the special characters.
Eg: abc$abc should be bcd$bcd
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class AsciiIncrement {
    /**
     * Takes a string input from the user and displays the same string incrementing the
     * ascii value by 1 excluding the special characters.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        //checks when string is empty or not
        if(input.length()<1){
            System.out.println("No string given");
            return;
        }
        //converts String into character array
        char[] arr = input.toCharArray();

        System.out.println("Before incrementing the ascii of the alphabets: "+input);
        //increments the ascii of every character of the character array by 1
        for(int i=0;i<arr.length;i++){
            //fetches the ascii of the character and stores it into an integer
            int ascii = (int)arr[i];
            //checks if the character is alphabet or not
            if((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)){
                arr[i]=(char)(ascii+1);
            }
        }
        //stores the updated character array into a new string
        String newValue = String.valueOf(arr);
        //displays the new result
        System.out.println("After incrementing the ascii of the alphabets: "+newValue);
        scanner.close();
    }
}

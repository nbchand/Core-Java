/*
9. Write a program to take an array of strings and display the length of strings in
an array.
 */
package com.infodev.string_exercise;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class StringArrayLength {
    /**
     * Takes an array of strings and displays the length of strings in
     * an array
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Strings do you want to provide?");
        //takes input regarding the number of String in the array
        int num = scanner.nextInt();
        scanner.nextLine();

        //initialize arrays to store Strings as well as length of those Strings
        String arr[] = new String[num];
        int len[] = new int[num];

        //loop to take input of Strings as well as calculate the length of those String
        for(int i=0;i<num;i++){
            System.out.println("Provide String number "+(i+1)+" :");
            //takes input of the String
            arr[i] = scanner.nextLine();
            //calculates the length of the String and calculates its length
            len[i] = arr[i].length();
        }
        //loop to display the length of the Strings
        for(int i=0;i<num;i++){
            System.out.println("The length of String number "+(i+1)+" is "+len[i]);
        }
        scanner.close();
    }
}

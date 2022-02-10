/*
12.Write a program to check if the word 'orange' is present in the "This is orange
 juice".
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class OrangeInString {
    /**
     * Checks if the word 'orange' is present in the sentence "This is orange
     *  juice".
     */
    public static void performTask() {
        String mainString = "This is orange juice.";
        //splits string into an array of strings
        String[] arr = mainString.split(" ");
        int flag = 0;
        //traverses all the elements of the String array
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i].equals("orange")) {
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println("The word 'orange' is not present in the given String");
        }
        else {
            System.out.println("The word 'orange' is present in the given String");
        }

    }

}

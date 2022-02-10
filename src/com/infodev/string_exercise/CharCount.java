/*
26.Write a Java program to concatenate a given string with itself a given number
of times.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class CharCount {
    public static void performTask() {
        String str = "occurrence";
        char c = 'r';
        String charStr = String.valueOf(c);
        Integer countOccurance=0;
        for (String character : str.trim().split("")){
            if (character.equalsIgnoreCase(charStr)){
                countOccurance++;
            }
        }
        System.out.println(str + " occurs " +countOccurance+ " times");
    }
}
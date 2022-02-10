/*
14.Write a program to find the number of vowels, consonants, digits and white space
characters in a string.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class DifferentCharacters {
    /**
     * Finds different character count in a String
     */
    public static void performTask() {
        String input = "Hello world!";
        Integer vowelCounts = 0, consonantsCount = 0, digitsCount = 0, spaceCount = 0;
        //distinguish each character from input
        for (int i = 0; i < input.length(); i++) {
            char singleChar = input.charAt(i);
            if (Character.isDigit(singleChar)) {
                digitsCount++;
            } else if (Character.isWhitespace(singleChar)) {
                spaceCount++;
            } else if (Character.isLetter(singleChar)) {
                if (singleChar == 'a' || singleChar == 'e' || singleChar == 'i' || singleChar == 'o' || singleChar == 'u') {
                    vowelCounts++;
                } else {
                    consonantsCount++;
                }

            }
        }
        System.out.println("No of Digits = " + digitsCount);
        System.out.println("No of White space = " + spaceCount);
        System.out.println("No of vowel = " + vowelCounts);
        System.out.println("No of Consonants = " + consonantsCount);

    }
}

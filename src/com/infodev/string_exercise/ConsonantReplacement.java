/*
15. Write a program to replace all consonants from the string "Hello, have a good day" with your favourite character.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class ConsonantReplacement {
    /**
     * Replaces consonants with 'N'
     */
    public static void performTask() {
        String input = "Hello, have a good day";
        for (int i = 0; i < input.length(); i++) {
            char singleChar = input.charAt(i);
            if (Character.isLetter(singleChar)) {
                if (singleChar != 'a' && singleChar != 'e' && singleChar != 'i' && singleChar != 'o' && singleChar != 'u') {
                    input = input.replace(singleChar, 'N');
                }
            }
        }
        System.out.println(input);
    }

}

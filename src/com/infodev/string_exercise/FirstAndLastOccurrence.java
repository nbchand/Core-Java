/*
13.Write a program to find the first and the last occurrence of the letter 'o' and
 character ',' in "Hello, World”.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class FirstAndLastOccurrence {
    /**
     * Prints first and last occurrence of given character in the sentence
     */
    public static void performTask() {
        String str = "Hello, World";
        char ch = 'o';
        Integer firstOccurrence = null;
        Integer lastOccurrence = null;
        //traverses all the characters in the String
        for (Integer i = 0; i < str.length(); i++) {
            if (firstOccurrence != null && lastOccurrence != null) {
                if (str.charAt(i) == ch) {
                    lastOccurrence = i;
                }
            }
            if (firstOccurrence == null) {
                if (ch == str.charAt(i)) {
                    firstOccurrence = i;
                }
            }

            if (firstOccurrence != null && lastOccurrence == null) {
                lastOccurrence = i;
            }
        }

        System.out.println("First occurrence: " + (firstOccurrence + 1));
        System.out.println("Last occurrence: " + (lastOccurrence + 1));
    }

}
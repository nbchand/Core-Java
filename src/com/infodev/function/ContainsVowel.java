/*
23. Write a method that takes input string from the user and return true if
it contains vowels otherwise false.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class ContainsVowel {
    public static boolean checkIfStringHasVowels(String input) {
        for (char c : input.toCharArray()) {
            if (VowelsCount.isVowel(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints if the given String has vowels or not
     */
    public static void performTask() {
        String str = "Hello";
        System.out.println("Presence of vowels: " + checkIfStringHasVowels(str));
    }
}

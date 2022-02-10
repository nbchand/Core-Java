/*
16. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class Epresent {
    /**
     * Checks if e is present in Umbrella or not
     */
    public static void performTask() {
        String str = "Umbrella";
        String[] split = str.split("");
        for (String character : split) {
            if (character.equalsIgnoreCase("e")) {
                System.out.println("E is present");
            }
        }
        System.out.println("E is absent");
    }
}

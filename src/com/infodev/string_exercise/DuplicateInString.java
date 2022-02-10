/*
74.Write a Java program to count and print all the duplicates in the input string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class DuplicateInString {
    private static final int MAX_CHARS = 256;

    public static void CountCharacters(String str1, int[] ctr) {
        for (int i = 0; i < str1.length(); i++)
            ctr[str1.charAt(i)]++;
    }

    public static void showDuplicates(String str1) {
        int ctr[] = new int[MAX_CHARS];
        CountCharacters(str1, ctr);
        for (int i = 0; i < MAX_CHARS; i++)
            if (ctr[i] > 1)
                System.out.printf("%c  appears  %d  times\n", i, ctr[i]);
    }

    public static void performTask() {
        String str1 = "helloeveryone";
        System.out.println("The given string is: " + str1);
        System.out.println("The duplicate characters and counts are: ");
        showDuplicates(str1);
    }
}


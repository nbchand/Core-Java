/*
22. Write a value-returning method, isVowel that returns the value true if
a given character is a vowel, and otherwise returns false. In main()
method accept a string from the user and count the number of vowels in
that string.
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class VowelsCount {
    public static boolean isVowel(char c) {
        String str = String.valueOf(c);
        c = str.toLowerCase().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    /**
     * Takes a String as input from user and prints the no. of vowels present in the String
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        System.out.println("There are " + count + " vowels in the given String.");
        scanner.close();
    }
}

/*
38.Write a program in java to check whether two given strings are an
anagram.
Test Data :
Input the first String : spare
Input the second String : pears
Expected Output :
spare and pears are Anagram.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class Anagram {
    /**
     * Checks whether provided Strings are anagrams or not
     * @param str1 first String
     * @param str2 second String
     * @return true if Strings are anagram otherwise false
     */
    public static boolean areAnagram(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            if (!str1.contains(String.valueOf(str2.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints whether the given strings are anagrams or not
     */
    public static void performTask() {
        String str1 = "pears";
        String str2 = "spear";
        if (areAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

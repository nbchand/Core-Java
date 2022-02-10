/*
17.Write a Java program to count how many times the substring 'life' is present
anywhere in a given string. Counting can also happen for the substring 'li?e',
any character instead of 'f'.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class LifePresent {
    public static int substringCounting(String str) {
        int len = str.length();
        int ctr = 0;
        String firsttwo = "li";
        String lastone = "e";
        if (len < 4)
            return 0;
        for (int i = 0; i < len - 3; i++) {
            if (firsttwo.compareTo(str.substring(i, i + 2)) == 0 && lastone.compareTo(str.substring(i + 3, i + 4)) == 0)
                ctr++;
        }
        return ctr;
    }

    /**
     * Prints the count of l*fe word in a sentence
     */
    public static void performTask() {
        String str1 = "livelifekingsize";
        System.out.println("The given string is: " + str1);
        System.out.println("The substring life or li?e appear number of times: " + substringCounting(str1));
    }
}

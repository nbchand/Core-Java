/*
21.Write a method that takes as input a nonnegative integer and returns true
if the number is a palindrome; otherwise, it returns false. Also write a
program to test your method.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class CheckPalindrome {
    public static boolean isPalindrome(int num) {
        String numString = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder(numString);
        String newString = String.valueOf(stringBuilder.reverse());
        if (numString.equals(newString)) {
            return true;
        }
        return false;
    }

    /**
     * Prints whether a number is palindrome or not
     */
    public static void performTask() {
        int num = 505;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}

/*
30.Write a Java program to count a number of Unicode code points in the
  specified text range of a String.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class UnicodeCount {
    public static int getUniCode(String str, Integer startIndex, Integer endIndex) {
        Integer number = str.codePointCount(startIndex, endIndex);
        return number;
    }

    public static void performTask() {
        System.out.println("Unicode count: " + getUniCode("Hello world", 1, 3));
    }
}

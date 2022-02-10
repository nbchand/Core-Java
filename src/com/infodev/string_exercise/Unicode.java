/*
 28.Write a Java program to get the character (Unicode code point) at the given
 index within the String.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class Unicode {
    public static void performTask() {
        String str = "hello";
        int index = 3;
        int unicode = str.charAt(index - 1);
        System.out.println("Given index " + unicode);
        int unicodeBefore = str.charAt(index - 2);
        System.out.println("Before Index " + unicodeBefore);
    }
}

/*
79.Write a Java program to append two given strings such that, if the
concatenation creates a double character then omit one of the characters
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class StringAppend {
    public String conCat(String st1, String st2) {
        if (st1.length() != 0 && st2.length() != 0 && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1);
        return st1 + st2;
    }

    public static void performTask() {
        StringAppend obj = new StringAppend();
        String str1 = "food";
        String str2 = "door";
        System.out.println("The given strings are: " + str1 + "  and  " + str2);
        System.out.println("The string after concatination are: " + obj.conCat(str1, str2));
    }
}

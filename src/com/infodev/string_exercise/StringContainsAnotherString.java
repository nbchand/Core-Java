/*
 23. Write a Java program to check if a given string contains another string. Return
 true or false
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class StringContainsAnotherString {
    /**
     * Returns true if String contains another String otherwise false
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean doesContain(String str1, String str2) {
        Boolean result = false;
        //split string into array
        String[] arr = str1.split(" ");
        //check is contains or not
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i].equals(str2)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * check if a given string contains another string
     */
    public static void performTask() {
        String str1 = "Hello world";
        String str2 = "world";

        if (doesContain(str1, str2)) {
            System.out.println(str1 + " contains " + str2);
        } else {
            System.out.println(str1 + " doesn't contain " + str2);
        }
    }
}

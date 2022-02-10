/*
78.Write a Java program to remove all adjacent duplicates recursively from a
given string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class AdjacentDuplicate {
    public static void check(String str) {
        if (str.length() <= 1) {
            System.out.println(str);
            return;
        }
        String n = new String();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                if (i < str.length() - 2 && str.charAt(i) != str.charAt(i + 2))
                    i += 2;
                else
                    i++;
                count++;
            }
            if (i != str.length() - 1)
                n = n + str.charAt(i);
            else {
                if (i == str.length() - 1 && str.charAt(i) != str.charAt(i - 1))
                    n = n + str.charAt(i);
            }
        }
        if (count > 0)
            check(n);
        else
            System.out.println(n);
    }

    public static void performTask() {
        String ab = "aabaarbarccrabmq";
        System.out.println("The given string is: " + ab);
        System.out.println("The new string after removing all adjacent duplicates is:");

        check(ab);
    }
}

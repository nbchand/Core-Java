/*
35. Write a java program to find the duplicate values of an array of string
values.
 */
package com.infodev.array_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class DuplicateInStringArray {
    /**
     * Finds the duplicate values of an array of string
     * values.
     */
    public static void performTask() {
        String[] str = {"apple", "banana", "mango", "apple"};
        List<String> duplicate = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    duplicate.add(str[i]);
                }
            }
        }
        System.out.println("Duplicate Strings in " + Arrays.toString(str) + " : " + duplicate);
    }
}

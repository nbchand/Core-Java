/*
71.Write a Java program to remove "b" and "ac" from a given string.
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class Removebandc {
    public static void performTask() {
        String data = "Bacon boy";
        data = data.replace("b","");
        data = data.replace("ac","");
        System.out.println(data);
    }
}

/*
29.Write a Java method to check whether a year (integer) entered by the user
is a leap year or not
Expected output:
Input a year: 2017
false
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Takes an integer as input and checks whether it is leap year or not
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}

/*
42.Create a simple java method to read String from users and manipulate that
data(like concatenation).
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class StringConcat {
    /**
     * Takes two String as input and displays their concatenation
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second String:");
        String str2 = scanner.nextLine();
        System.out.println("After concatenation: " + str1.concat(str2));
        scanner.close();
    }
}

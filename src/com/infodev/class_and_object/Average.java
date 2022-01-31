/*
7. Print the average of three numbers entered by the user by creating a class
named 'Average' having a method to calculate and print the average.
 */
package com.infodev.class_and_object;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class Average {

    private int a, b, c;

    /**
     * Initializes the object of Average class and assigns values to the three numbers
     * @param a first number
     * @param b second number
     * @param c third number
     */
    public Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Calculates the average of three numbers
     */
    public void calculateAverage() {
        float avg = (float) (a + b + c) / 3;
        System.out.println("The average of " + a + ", " + b + ", " + c + " is " + avg);
    }

    /**
     * Takes input of three numbers and calculates their average
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = scanner.nextInt();

        System.out.println("Enter the second number:");
        int y = scanner.nextInt();

        System.out.println("Enter the third number:");
        int z = scanner.nextInt();

        //assigns the inputs to the constructor as parameters
        Average average = new Average(x, y, z);
        average.calculateAverage();

        scanner.close();
    }
}

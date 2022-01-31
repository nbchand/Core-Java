/*
6. Write a program to print the area of a rectangle by creating a class named 'Area'
taking the values of its length and breadth as parameters of its constructor and
having a method named 'returnArea' which returns the area of the rectangle.
Length and breadth of the rectangle are entered through the keyboard.
 */
package com.infodev.class_and_object;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class AreaOfRectangle {

    private int length;
    private int breadth;

    /**
     * Parameterized constructor to instantiate a Rectangle object assigning the values of length and breadth
     *
     * @param length  Length of the rectangle
     * @param breadth Breadth of the rectangle
     */
    public AreaOfRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /**
     * Calculates the area of provided rectangle
     *
     * @return The product of length and breadth
     */
    public int returnArea() {
        return length * breadth;
    }

    /**
     * Takes length and breadth as input and initializes a rectangle as well as prints its area
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        //take input
        System.out.println("Enter the length of the rectangle:");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = scanner.nextInt();
        //instantiates an object and pass length and breadth to the constructor as parameters
        AreaOfRectangle rectangle1 = new AreaOfRectangle(length, breadth);

        System.out.println("The area of rectangle having length = " + rectangle1.length + " and breadth = " + rectangle1.breadth + " is " + rectangle1.returnArea());
        scanner.close();
    }
}

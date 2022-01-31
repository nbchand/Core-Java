/*
5. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with a method named 'Area'
which returns the area and length and breadth passed as parameters to its
constructor.
 */
package com.infodev.class_and_object;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class Rectangle {

    private int length;
    private int breadth;

    /**
     * Parameterized constructor to instantiate a Rectangle object assigning the values of length and breadth
     *
     * @param length  Length of the rectangle
     * @param breadth Breadth of the rectangle
     */
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /**
     * Calculates the area of provided rectangle
     *
     * @return The product of length and breadth
     */
    public int getArea() {
        return length * breadth;
    }

    /**
     * Initializes two rectangles and prints their area
     */
    public static void performTask() {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        System.out.println("The area of rectangle having length = " + rectangle1.length + " and breadth = " + rectangle1.breadth + " is " + rectangle1.getArea());
        System.out.println("The area of rectangle having length = " + rectangle2.length + " and breadth = " + rectangle2.breadth + " is " + rectangle2.getArea());
    }
}

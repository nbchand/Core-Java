/*
1. Write a program to print the area of a rectangle by creating a class named 'Area'
having two methods. First method named as 'setDim' takes length and breadth of
the rectangle as parameters and the second method named as 'getArea' returns
the area of the rectangle. Length and breadth of the rectangle are entered
through the keyboard
 */
package com.infodev.class_and_object;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class Area {

    private float length;
    private float breadth;

    /**
     * Sets dimensions of the shape
     * @param length Length of the shape
     * @param breadth Breadth of the shape
     */
    public void setDim(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /**
     * Calculates the area of the shape
     * @return The product of length and breadth
     */
    public float getArea() {
        return length * breadth;
    }

    /**
     * Takes length and breadth as input and calculates area
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();

        System.out.println("Please enter the length:");
        float l = scanner.nextFloat();

        System.out.println("Please enter the breadth:");
        float b = scanner.nextFloat();

        //calls setDim() and sets dimensions of the shape
        area.setDim(l, b);

        //prints the area of the shape by calling getArea()
        System.out.println("The required area is " + area.getArea());

        scanner.close();
    }
}

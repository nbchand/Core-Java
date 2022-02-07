/*
4. Write a program to print the circumference and area of a circle of radius entered
by the user by defining your own method.
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class CircleAreaPerimeter {
    public static float getCircumference(float radius) {
        return 2 * (22f / 7f) * radius;
    }

    public static float getArea(float radius) {
        return (22f / 7f) * radius * radius;
    }

    /**
     * Takes radius of circle as input and calculates area and perimeter of the circle
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        float radius = scanner.nextFloat();
        System.out.println("Circumference: " + getCircumference(radius));
        System.out.println("Area: " + getArea(radius));
        scanner.close();
    }
}

/*
26. Write a method to find the area of a circle.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class CircleArea {
    public static float getArea(float radius) {
        return (22f / 7f) * radius * radius;
    }

    /**
     * Prints area of a circle whose radius is provided
     */
    public static void performTask() {
        float radius = 7f;
        System.out.println("The area of the circle having radius " + radius + " is " + getArea(radius));
    }
}

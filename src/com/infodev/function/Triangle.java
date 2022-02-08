/*
31.Write Java methods to calculate the area of a triangle.
Expected Output:
Input Side-1: 10
Input Side-2: 15
Input Side-3: 20
The area of the triangle is 72.6184377413890
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class Triangle {
    /**
     * Calculates the area of a triangle having 3 sides
     *
     * @param a first side
     * @param b second side
     * @param c third side
     * @return The area of the triangle which is calculated using Heron's formula
     * @return
     */
    public static float getArea(float a, float b, float c) {
        float s = (float) (a + b + c) / 2;
        float underRoot = s * (s - a) * (s - b) * (s - c);
        //since area of triangle = (s*(s-a)*(s-b)*(s-c))^(1/2)
        //where s is semi perimeter of the triangle and a.b.c are sides of it
        float area = (float) Math.pow(underRoot, 0.5);
        return area;
    }

    /**
     * Takes three sides as input and calculates area of the triangle
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side-1: ");
        float a = scanner.nextFloat();
        System.out.print("Input side-2: ");
        float b = scanner.nextFloat();
        System.out.print("Input side-3: ");
        float c = scanner.nextFloat();
        System.out.println("The area of the triangle is " + getArea(a, b, c));
        scanner.close();
    }
}

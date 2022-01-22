/*
k) WAP to check whether a triangle can be formed by the given value for the
angles.[Sum of the angles in a triangle should be 180 ]
(1) Test Data :
(2) 40 55 65
(3) Expected Output :
(4) The triangle is not valid.

 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class TriangleValidity {
    /**
     * Takes three angles of triangle as input
     * and identifies whether the triangle is valid or not.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        //takes input of three angles of triangle
        System.out.println("Enter the value of first angle of the triangle");
        float a = scanner.nextFloat();
        System.out.println("Enter the value of second angle of the triangle");
        float b = scanner.nextFloat();
        System.out.println("Enter the value of third angle of the triangle");
        float c = scanner.nextFloat();

        //calculates the sum of the three angles of the triangle
        float sum = a+b+c;

        //checks if the sum is equal to 180 or not
        if(sum!=180){
            System.out.println("The triangle is not valid");
        }
        else{
            System.out.println("The triangle is valid");
        }

        scanner.close();
    }
}

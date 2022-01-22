/*
j) WAP to take input on three sides of the triangle and check if the triangle is
equilateral or isosceles or scalene.
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class TriangleSides {
    /**
     * Takes input of three sides of the triangle and checks if the triangle is
     * equilateral or isosceles or scalene.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        //take user input about the sides of triangle
        System.out.println("Enter the value of first side of triangle:");
        float a = scanner.nextFloat();
        System.out.println("Enter the value of second side of triangle:");
        float b = scanner.nextFloat();
        System.out.println("Enter the value of third side of triangle:");
        float c = scanner.nextFloat();

        //checks triangle validity
        if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("Sorry, the triangle of provided sides is invalid");
            return;
        }

        //checks for equilateral triangle possibility
        if(a==b&&a==c){
            System.out.println("The triangle is an equilateral triangle");
        }
        //checks for isosceles triangle possibility
        else if(a==b||a==c||b==c){
            System.out.println("The triangle is an isosceles triangle");
        }
        //executes if triangle is scalene
        else{
            System.out.println("The triangle is a scalene triangle");
        }
        scanner.close();
    }
}

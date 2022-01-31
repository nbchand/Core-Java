/*
8. Print the sum, difference and product of two complex numbers by creating a
class named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by the user
 */
package com.infodev.class_and_object;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void sum(Complex c1, Complex c2) {
        int sumReal = c1.real + c2.real;
        int sumImaginary = c1.imaginary + c2.imaginary;

        System.out.println("The sum of " + c1.real + "+(" + c1.imaginary + ")i and " + c2.real + "+(" + c2.imaginary + ")i is " + sumReal + "+(" + sumImaginary + ")i");
    }

    public static void difference(Complex c1, Complex c2) {
        int diffReal = c1.real - c2.real;
        int diffImaginary = c1.imaginary - c2.imaginary;

        System.out.println("The difference between " + c1.real + "+(" + c1.imaginary + ")i and " + c2.real + "+(" + c2.imaginary + ")i is " + diffReal + "+(" + diffImaginary + ")i");
    }

    public static void product(Complex c1, Complex c2) {
        int productReal = c1.real * c2.real;
        int productImaginary = c1.imaginary * c2.imaginary;

        int result = productReal - productImaginary;

        System.out.println("The product of " + c1.real + "+(" + c1.imaginary + ")i and " + c2.real + "+(" + c2.imaginary + ")i is " + result);
    }

    /**
     * Takes two complex numbers and performs addition, subtraction as well as multiplication between them
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For first complex number");
        System.out.println("Enter real number:");
        int r1 = scanner.nextInt();
        System.out.println("Enter imaginary number:");
        int i1 = scanner.nextInt();

        System.out.println("For second complex number");
        System.out.println("Enter real number:");
        int r2 = scanner.nextInt();
        System.out.println("Enter imaginary number:");
        int i2 = scanner.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        sum(c1, c2);
        difference(c1, c2);
        product(c1, c2);

        scanner.close();
    }
}

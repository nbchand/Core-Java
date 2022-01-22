/*
e) WAP to take the person’s height in feet and convert it into centimeters and display
it.
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class FeetToCentimeter {
    /**
     *  Takes a person’s height in feet and converts it into centimeters and displays it.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your height in feet and inches");
        System.out.println("Enter the feet first:");
        System.out.println("(e.g if your height is 5' 10\" write 5 here )");

        //takes input of height in feet
        int feet = scanner.nextInt();

        System.out.println("Now enter the remaining inches:");
        System.out.println("(e.g if your height is 5' 10\" write 10 here )");

        //takes input of remaining height which is in inches
        int inch = scanner.nextInt();

        //convert the total height into inches
        inch = inch+(feet*12);

        //1 inch = 2.54 cm, conversion from inches to centimeters is done
        double heightInCM = (double)inch*2.54;

        //height in cm is displayed
        System.out.println("Your height in cm is "+heightInCM+" cm.");

        scanner.close();
    }
}

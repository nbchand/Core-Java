/*
10.Add two distances in inch-feet by creating a class named 'AddDistance'.
 */
package com.infodev.class_and_object;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class AddDistance {
    private int feet;
    private int inch;

    public AddDistance(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "feet=" + feet +
                ", inch=" + inch;
    }

    /**
     * Takes two inputs in both feet and inches and displays their sum
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        //prints information for user
        System.out.println("Provide two distances as below");
        System.out.println("e.g If the distance is 5 feet 10 inches, supply feet as 5 and inch as 10.");

        //starts taking input
        System.out.println("\nFor the first distance");
        System.out.println("Enter the feet:");
        int feet1 = scanner.nextInt();
        System.out.println("Enter the inches:");
        int inch1 = scanner.nextInt();
        System.out.println("\nFor the second distance");
        System.out.println("Enter the feet:");
        int feet2 = scanner.nextInt();
        System.out.println("Enter the inches:");
        int inch2 = scanner.nextInt();

        //new object created to store and manipulate data
        AddDistance sumDistance = new AddDistance(feet1+feet2,inch1+inch2);
        //if distance in inches is greater than 12 then converts them into feet
        while (sumDistance.getInch()>=12){
            sumDistance.setFeet(sumDistance.getFeet()+1);
            sumDistance.setInch(sumDistance.getInch()-12);
        }
        //displays final result using toString()
        System.out.println("The sum of these two distances gives "+sumDistance);
        scanner.close();
    }
}

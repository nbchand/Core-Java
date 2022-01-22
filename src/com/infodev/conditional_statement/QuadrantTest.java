/*
f) WAP to take two input coordinates x and y from the user and find in which
quadrant does the coordinate lie.
i) +x +y Q1
ii) -x +y Q2
iii) -x -y Q3
iv) +x -y Q4
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class QuadrantTest {
    /**
     *  Takes two coordinates x and y as input from the user and finds in which
     *  quadrant does the coordinate lie.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x-coordinate:");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y-coordinate:");
        int y = scanner.nextInt();

        //first quadrant check
        if(x>0&&y>0){
            System.out.println("The coordinate lies in first quadrant Q1.");
        }
        //second quadrant check
        else if(x<0&&y>0){
            System.out.println("The coordinate lies in second quadrant Q2.");
        }
        //third quadrant check
        else if(x<0&&y<0){
            System.out.println("The coordinate lies in third quadrant Q3.");
        }
        //fourth quadrant check
        else if(x>0&&y<0){
            System.out.println("The coordinate lies in fourth quadrant Q4.");
        }
        //origin check
        else if(x==0&&y==0){
            System.out.println("The coordinate lies at the origin");
        }
        //executes if the coordinate lies in either x-axis or y-axis
        else{
            System.out.println("The coordinate lies in either of the axes");
        }
        scanner.close();
    }
}

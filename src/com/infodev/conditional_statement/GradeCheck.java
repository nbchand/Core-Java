/*
g) WAP to take marks in 5 subjects of the student , The marks must not be less than
0 and also must not be greater than 100. Calculate the total scored by the student
and find his/her grade. PS: make your own grading criteria.
 */
package com.infodev.conditional_statement;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 0.1
 */
public class GradeCheck {
    /**
     *  Checks grades of a student.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        int total=0;

        //loop to take inputs of the marks of 5 subjects
        for(int i=1; i<5; i++){
            System.out.println("Enter the marks of subject "+i);
            int marks = scanner.nextInt();

            //exits the program if subject marks is greater than 100 or less than 0
            if(marks<0||marks>100){
                System.out.println("Invalid marks");
                return;
            }
            else{
                //accumulates the obtained marks
                total = total+marks;
            }
        }

        //calculates percentages of obtained marks
        float percent = (float) total/5;

        //condition checking starts
        if(percent>90){
            System.out.println("You secured A+ grade");
        }
        else if(percent>80){
            System.out.println("You secured A grade");
        }
        else if(percent>70) {
            System.out.println("You secured B+ grade");
        }
        else if(percent>60){
            System.out.println("You secured B grade");
        }
        else if(percent>50){
            System.out.println("You secured C+ grade");
        }
        else if(percent>40){
            System.out.println("You secured C grade");
        }
        else if(percent>30){
            System.out.println("You secured D+ grade");
        }
        else{
            System.out.println("You secured F grade");
        }

        scanner.close();
    }
}

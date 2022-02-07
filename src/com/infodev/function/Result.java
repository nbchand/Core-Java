/*
20.Write a program which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as
below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
 */
package com.infodev.function;

import java.util.Scanner;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class Result {
    public static void displayGrade(float marks){
        if(marks<0||marks>100){
            System.out.println("Sorry, invalid input!");
            return;
        }
        if(marks>=91){
            System.out.println("Grade is AA");
        }
        else if(marks>=81){
            System.out.println("Grade is AB");
        }
        else if(marks>=71){
            System.out.println("Grade is BB");
        }
        else if(marks>=61){
            System.out.println("Grade is BC");
        }
        else if(marks>=51){
            System.out.println("Grade is CD");
        }
        else if(marks>=41){
            System.out.println("Grade is DD");
        }
        else{
            System.out.println("Sorry, you have failed");
        }
    }

    /**
     * Prints grade on the basis of marks
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your marks!");
        float marks = scanner.nextFloat();
        displayGrade(marks);
        scanner.close();
    }
}

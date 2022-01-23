/*
15. Write a program to calculate the sum of the following series where n is input by
user. 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
where n is a positive integer and input by user.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class NumeratorAndDenominator {
    /**
     * Takes an integer as input and calculates the sum of related series
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        int numerator=0, denominator=1;
        System.out.println("Enter the length of the series:");
        int n = scanner.nextInt();

        //if user enters 1 sum is displayed as 1
        if(n==1){
            System.out.println("The sum of the series is 1");
            return;
        }

        //main logic
        //calculate denominator first
        for(int i=1;i<=n;i++){
            denominator = denominator*i;
        }
        //calculate numerator with the help of denominator
        for(int i=1;i<=n;i++){
            numerator = numerator+(denominator/i);
        }


        System.out.print("The sum of the series ");
        //loop to display the results
        for(int i=1;i<=n;i++){
            if(i==n){
                System.out.print("1/"+i);
                break;
            }
            System.out.print("1/"+i+" + ");
        }

        System.out.println(" = "+numerator+"/"+denominator+" = "+(float)numerator/denominator);

        scanner.close();
    }
}

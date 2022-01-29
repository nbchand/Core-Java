/*
14. Write a program to print Fibonacci series of n terms where n is input by user :
Example Output : 0 1 1 2 3 5 8 13 24 .....
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class FibonacciSeries {
    /**
     * Takes a number n as input and prints a fibonacci series consisting of n numbers
     */
    public static void performTask() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of digits you want to display:");
        int n = scanner.nextInt();
        System.out.println("The first "+n+" fibonacci numbers are given below:");

        //displays 0 if entered number is either 0 or 1
        if(n==0||n==1){
            System.out.println("0");
            return;
        }

        System.out.print("0\t1\t");
        int term1=0, term2=1;

        //iterates loop n-2 times because first two numbers of fibonacci series 0 and 1 are already displayed
        for(int i=1;i<n-1;i++){

            //calculate next by summation of previous two terms
            int nextTerm = term1+term2;
            //update term1 and term2
            term1 = term2;
            term2 = nextTerm;
            //print the new term
            System.out.print(nextTerm+"\t");
        }
        scanner.close();
    }
}

/*
7. Write a program that reads a range of numbers as input, and iterates it then prints the sum
of the even and odd integers.
Eg : 1 10
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class OddEvenSum {
    /**
     * Reads a range of numbers as input, and iterates then to print the sum
     * of the even and odd integers.
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        //takes the no. of iteration as input
        int iteration = scanner.nextInt();
        //checks if the iteration is at least 1 or not
        if(iteration<=0){
            System.out.println("Thank you!");
            return;
        }

        //initializes an integer array to store the entered numbers
        int arr[] = new int[iteration];
        int evenSum = 0, oddSum = 0;
        //loop to take input and perform summation of odd and even numbers
        for(int i=0;i<iteration;i++){
            System.out.println("Enter number "+(i+1));
            arr[i] = scanner.nextInt();
            //checks if the number is even
            if(arr[i]%2==0){
                evenSum = evenSum+arr[i];
            }
            //executes if the number is odd
            else{
                oddSum = oddSum+arr[i];
            }
        }
        //display the odd sum and even sum
        System.out.println("The sum of odd numbers is: "+oddSum);
        System.out.println("The sum of even numbers is: "+evenSum);
        scanner.close();
    }
}

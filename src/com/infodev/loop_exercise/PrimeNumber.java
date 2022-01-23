/*
8. Write a program that prompts the user to input a positive integer. It should then output a
message indicating whether the number is a prime number.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class PrimeNumber {
    /**
     * Takes a number as input and prints whether the number is prime or not
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);
        //takes input of a number
        System.out.println("Enter a positive natural number:");
        int num = scanner.nextInt();
        //checks whether the number is positive or not
        if(num<=0){
            System.out.println("Entered number is not positive");
            return;
        }
        //1 is neither a prime not a composite number
        if(num==1){
            System.out.println("1 is neither a prime number nor a composite number");
            return;
        }
        //2 is a prime number
        if(num==2){
            System.out.println("2 is a prime number");
            return;
        }
        //iniatializes flag variable for future use
        int flag = 0;
        //loop which divide the entered number by all the numbers smaller than it
        for(int i=num-1; i>1;i--){
            //if the number is perfectly divisible by numbers smaller than it
            //then flag is incremented confirming it's a composite number
            if(num%i==0){
                flag++;
                break;
            }
        }
        //if flag is 0 then the number is a prime number otherwise not
        if(flag==0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is a composite number");
        }
        scanner.close();
    }
}

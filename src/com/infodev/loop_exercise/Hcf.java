/*
9. Write a program to calculate HCF of Two given numbers.
 */
package com.infodev.loop_exercise;

import java.util.Scanner;
/**
 * @author Narendra
 * @version 0.1
 */
public class Hcf {
    /**
     * Takes two numbers as input and calculates their H.C.F
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first natural number:");
        //takes number as input
        int num1 = scanner.nextInt();

        System.out.println("Enter second natural number:");
        int num2 = scanner.nextInt();

        //checks whether the numbers are natural numbers or not
        if(num1<=0||num2<=0){
            System.out.println("Entered number is not a natural number");
            return;
        }

        //calls calculateHcf() method and displays the H.C.F of the given two numbers
        System.out.println("The H.C.F for both the numbers "+num1+" and "+num2+" is "+calculateHcf(num1,num2));

        scanner.close();
    }

    /**
     * Calculates H.C.F of the given two numbers
     * @param num1 An integer value whose H.C.F needs to be calculated
     * @param num2 Another integer value whose H.C.F needs to be calculated
     * @return Returns an integer value as the H.C.F of the provided numbers
     */
    public static int calculateHcf(int num1,int num2){
        int hcf=1;
        //loop to iterate at least n times, where n is the minimum number among the provided two numbers
        for(int i=1;i<=num1&&i<=num2;i++){
            //check if i divides both provided numbers equally or not
            if(num1%i==0 && num2%i==0){
                //if i divides both num1 and num2 perfectly then it is assigned to h.c.f
                hcf=i;
            }
        }
        return hcf;
    }
}

/*
21. Write a program to print the numbers from 1 to 100 without using any number in the code.
 */
package com.infodev.loop_exercise;
/**
 * @author Narendra
 * @version 0.1
 */
public class WithoutNumbers {
    /**
     * Prints the numbers from 1 to 100 without using any number in the code
     */
    public static void performTask() {
        //ASCII of d is one hundred
        char val = 'd';
        String oneItemString = "a";
        //length of this String is one
        int len = oneItemString.length();

        //since we got both starting and ending point, we can easily print the required range
        for(int i=len; i<=(int)val; i++){
            System.out.println(i);
        }
    }
}

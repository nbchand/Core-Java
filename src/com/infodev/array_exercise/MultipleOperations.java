/*
13.Create an array with elements
and then find and display using functions
a. All the even numbers of an array
b. All the odd numbers of an array
c. All the prime numbers
d. All the negative numbers of an array
e. All the numbers exactly divisible by 5
f. Largest element in the array
g. Second-largest element in the array
h. Sum of all the numbers
i. Sum of all the prime numbers
j. Copy all the negative numbers in separate array
k. Copy all the positive numbers in a separate array and increment every
element by 10.
 */
package com.infodev.array_exercise;

import java.util.Arrays;
/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class MultipleOperations {

    /**
     * Displays all the even numbers of an array
     * @param arr integer array
     */
    public static void displayEven(int[] arr) {
        System.out.print("Even numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * Displays all the odd numbers of an array
     * @param arr integer array
     */
    public static void displayOdd(int[] arr) {
        System.out.print("Odd numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * Displays all the prime numbers of an array
     * @param arr integer array
     */
    public static void displayPrime(int[] arr) {
        System.out.print("Prime numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            //loop to check if the given number is divisible by all the numbers less than it or not
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag++;
                    break;
                }
            }
            //element having flag as 0 is a prime number
            if (flag == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * Displays all the negative numbers of an array
     * @param arr integer array
     */
    public static void displayNegative(int[] arr) {
        System.out.print("Negative numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * Displays all the numbers of an array divisible by 5
     * @param arr integer array
     */
    public static void displayDivisibleBy5(int[] arr) {
        System.out.print("Numbers exactly divisible by 5 in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    /**
     * Displays the largest number of an array
     * @param arr integer array
     */
    public static void displayLargestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Largest number in the array: " + arr[arr.length - 1]);
    }
    /**
     * Displays the second-largest number of an array
     * @param arr integer array
     */
    public static void displaySecondLargestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The second largest element in the array is " + arr[arr.length - 2]);
    }
    /**
     * Displays the sum of all the elements inside an array
     * @param arr integer array
     */
    public static void displaySum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println("The sum of all the elements in the array is " + sum);
    }
    /**
     * Displays the sum of all the prime numbers inside an array
     * @param arr integer array
     */
    public static void displayPrimeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            //loop to check if the given number is divisible by all the numbers less than it or not
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag++;
                    break;
                }
            }
            //element having flag as 0 is a prime number
            if (flag == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("The sum of all the prime numbers is " + sum);
    }
    /**
     * Displays all the negative numbers in a separate array
     * @param arr integer array
     */
    public static void copyNegative(int[] arr) {
        //usr filter() to filter out the negative numbers and reassign them to our array
        arr = Arrays.stream(arr).filter(x -> x < 0).toArray();
        System.out.println("Negative elements in separate array " + Arrays.toString(arr));
    }
    /**
     * Displays all the positive numbers in a separate array and increment each element by 10
     * @param arr integer array
     */
    public static void copyPositiveAndIncrementBy10(int[] arr) {
        //usr filter() to filter out the positive numbers
        arr = Arrays.stream(arr).filter(x -> x > 0).toArray();
        //loop to increment each element by 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10;
        }
        System.out.println("Positive elements in separate array with each element incremented by 10 " + Arrays.toString(arr));
    }

    /**
     * Perform various operations in an array
     */
    public static void performTask() {
        int[] arr = {-13, 4, 55, 8, 67, -90, 11, -15, 72, 31};
        System.out.println("Our array is " + Arrays.toString(arr));
        //Q.N. a)
        displayEven(arr);
        //Q.N. b)
        displayOdd(arr);
        //Q.N. c)
        displayPrime(arr);
        //Q.N. d)
        displayNegative(arr);
        //Q.N. e)
        displayDivisibleBy5(arr);
        //Q.N. f)
        displayLargestElement(arr);
        //Q.N. g)
        displaySecondLargestElement(arr);
        //Q.N. h)
        displaySum(arr);
        //Q.N. i)
        displayPrimeSum(arr);
        //Q.N. j)
        copyNegative(arr);
        //Q.N. k)
        copyPositiveAndIncrementBy10(arr);
    }
}

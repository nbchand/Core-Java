/*
10.Write the program to take an array of string input and sort the array according
to length of string both ascending and descending.
 */
package com.infodev.string_exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/28/2022
 */
public class SortArrayByLength {
    /**
     * Takes String array as input and sorts it based on the length of the String
     */
    public static void performTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Strings do you want to provide?");
        //takes input regarding the number of String in the array
        int num = scanner.nextInt();
        scanner.nextLine();

        //initialize arrays to store Strings
        String arr[] = new String[num];
        int len[] = new int[num];

        //loop to take input of Strings as well as calculate the length of those String
        for(int i=0;i<num;i++){
            System.out.println("Provide String number "+(i+1)+" :");
            //takes input of the String
            arr[i] = scanner.nextLine();
        }

        //sorts array and assigns them to variables
        String[] minToMax = sortAscending(arr);
        String[] maxToMin = sortDescending(arr);

        System.out.println();

        System.out.println("After ascending sorting: ");
        for(String str: minToMax){
            System.out.println(str);
        }

        System.out.println();

        System.out.println("After descending sorting: ");
        for(String str: maxToMin){
            System.out.println(str);
        }

        scanner.close();
    }

    /**
     * Sorts given array in ascending order
     * @param arr Array to be sorted
     * @return Sorted array
     */
    public static String[] sortAscending(String[] arr){
        int len = arr.length;
        //using bubble sort to sort the array in ascending order of the length of Strings
        for (int i=0; i<(len-1); i++) {
            for (int j=0; j<(len-i-1); j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    //swap the strings at arr[j+1] and arr[j]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    /**
     * Sorts given array in descending order
     * @param arr Array to be sorted
     * @return Sorted array
     */
    public static String[] sortDescending(String[] arr){
        int len = arr.length;
        //using bubble sort to sort the array in ascending order of the length of Strings
        for (int i=0; i<(len-1); i++) {
            for (int j=0; j<(len-i-1); j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    //swap the strings at arr[j+1] and arr[j]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}

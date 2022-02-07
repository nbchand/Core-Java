/*
12.WAP that check a prime number boolean checkPrime(int testNumber)
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class CheckPrime {
    public static boolean checkPrime(int testNumber) {
        if (testNumber == 0 || testNumber == 1) {
            return false;
        }
        if (testNumber == 2) {
            return true;
        }
        for (int i = 2; i < testNumber; i++) {
            if (testNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints whether a number is prime or not
     */
    public static void performTask() {
        int num = 13;
        if(checkPrime(num)){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }
    }
}

package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class PrimeInRange {
    public static void displayPrime(int start, int end){
        for(int i=start;i<=end;i++){
            if(CheckPrime.checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * Displays prime numbers between 1-1000
     */
    public static void performTask() {
        displayPrime(1,1000);
    }
}

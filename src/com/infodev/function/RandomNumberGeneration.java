/*
27. Write a method to generate a random number.
 */
package com.infodev.function;

import java.util.Random;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class RandomNumberGeneration {
    public static int generateRandom(){
        Random random = new Random();
        return random.nextInt();
    }

    /**
     * Prints a random number
     */
    public static void performTask() {
        System.out.println(generateRandom());
    }
}

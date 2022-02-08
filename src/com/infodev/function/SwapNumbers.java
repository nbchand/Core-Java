/*
34. Write a program in java to swap two numbers using a function.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class SwapNumbers {
    private int a;
    private int b;

    public SwapNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void performSwap(SwapNumbers obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    /**
     * Prints two numbers and swaps them
     */
    public static void performTask() {
        SwapNumbers obj = new SwapNumbers(5,7);
        System.out.println("Before swap A: "+obj.a);
        System.out.println("Before swap B: "+obj.b);
        performSwap(obj);
        System.out.println("After swap A: "+obj.a);
        System.out.println("After swap B: "+obj.b);
    }
}

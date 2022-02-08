/*
35. Write a program in java to find the sum of the series
1!/1+2!/2+3!/3+4!/4+5!/5 using the function.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class SumOfSeries {
    public static int getFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int getDenominator(int n) {
        int deno = 1;
        for (int i = 1; i <= n; i++) {
            deno = deno * i;
        }
        return deno;
    }

    public static int getNumerator(int n, int deno) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            int fact = getFactorial(i);
            num = num + (fact * (deno / i));
        }
        return num;
    }

    public static float divide(int num, int deno) {
        return (num * 1f) / (deno * 1f);
    }

    /**
     * Prints the sum of given series
     */
    public static void performTask() {
        int n = 5;
        int denominator = getDenominator(n);
        int numerator = getNumerator(n, denominator);
        float result = divide(numerator, denominator);
        System.out.println("The sum of the given series:");
        System.out.println("1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5");
        System.out.println("= (" + numerator + "/" + denominator + ")");
        System.out.println("= " + result);
    }
}

/*
73.Write a Java program to find the lexicographic rank of a given string.
Sample Output:
The Given String is: BDCA
The Lexicographic rank of the given string is: 12
N.B.: Total possible permutations of BDCA are(lexicographic order) :
ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA
BDAC BDCA
1 2 3 4 5 6 7 8 9 10
11 12
The BDCA appears in 12 positions of permutation (lexicographic order).
 */
package com.infodev.string_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-10
 */
public class LexicographicRank {
    public static int makefactorial(int n) {
        return (n <= 2) ? n : n * makefactorial(n - 1);
    }

    public static int calculateLexicoRank(String str, int n) {
        int ctrOfRank = 1;
        for (int i = 0; i < n; i++) {
            int ctr = 0;
            for (int j = i + 1; j <= n; j++) {
                if (str.charAt(i) > str.charAt(j)){
                    ctr++;
                }
            }
            ctrOfRank += ctr * makefactorial(n - i);
        }
        return ctrOfRank;
    }

    public static void performTask() {
        String str = "BDCA";
        System.out.println("The Given String is: " + str);
        int n = str.length();
        System.out.print("The Lexicographic rank of the given string is: " + calculateLexicoRank(str, n - 1));
    }
}


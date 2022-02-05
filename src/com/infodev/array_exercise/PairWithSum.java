/*
19. Count pairs with given sum
Example:
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-05
 */
public class PairWithSum {
    /**
     * Finds the number of pair of elements matching the given sum in an array
     */
    public static void performTask() {
        int n = 4;
        int k = 6;
        int arr[] = {1, 5, 7, 1};
        int count = 0;
        //outer loop to find first element in the pair
        for (int i = 0; i < n; i++) {
            //inner loop to find second element in the pair
            for (int j = i + 1; j < n; j++) {
                //increases the count if the condition is matched
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        System.out.println("No. of pairs = " + count);
    }
}

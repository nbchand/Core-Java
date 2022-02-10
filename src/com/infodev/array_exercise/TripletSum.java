
/*29. Find a triplet that sums to a given value.
Example:
Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in
the array sums up to 13.
 */
package com.infodev.array_exercise;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class TripletSum {
    /**
     * Displays triplets with given sum
     */
    public static void performTask() {
        int arr[] = {2, 1, 7, 8, -1, 0};
        int sum = 10;
        int count = 0;
        if (arr.length < 3) {
            System.out.println("The array doesn't have 3 elements");
        }
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Triplet with given sum are " + count + " in number");
    }
}

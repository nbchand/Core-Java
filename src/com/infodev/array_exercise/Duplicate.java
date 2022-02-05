/*
20. Find the duplicate element in an array.
 */
package com.infodev.array_exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-05
 */
public class Duplicate {
    /**
     * Finds duplicate elements in an array.
     */
    public static void performTask() {
        int arr[] = {1, 2, 1, 2, 3, 4, 2, 3, 10, 12};
        Map<Integer, Integer> mapArr = new HashMap<>();
        //puts array elements to a map variable as key and their appearance count as value
        for (int i : arr) {
            if (mapArr.containsKey(i)) {
                mapArr.put(i, mapArr.get(i) + 1);
            } else {
                mapArr.put(i, 1);
            }
        }
        System.out.print("The duplicate elements in the array are: ");
        //loop to display key value whose count is greater than 1
        for (Map.Entry<Integer, Integer> map : mapArr.entrySet()) {
            if (map.getValue() > 1) {
                System.out.print(map.getKey() + " ");
            }
        }
    }
}

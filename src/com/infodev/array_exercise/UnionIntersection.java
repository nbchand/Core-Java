/*
28. Find the Union and Intersection of the two sorted arrays
 */
package com.infodev.array_exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-09
 */
public class UnionIntersection {
    /**
     * Prints union of two arrays
     * @param array first array
     * @param array1 second array
     */
    static void displayUnion(Integer[] array, Integer[] array1) {
        List<Integer> firstList = Arrays.asList(array);
        List<Integer> secondList = Arrays.asList(array1);
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(firstList);
        set.addAll(secondList);
        Integer[] union = {};
        union = set.toArray(union);
        System.out.println("Union of arrays: "+Arrays.toString(union));
    }

    /**
     * Prints intersection of two arrays
     * @param array first array
     * @param array1 second array
     */
    static void displayIntersection(Integer[] array, Integer[] array1) {
        List<Integer> firstList = Arrays.asList(array);
        List<Integer> secondList = Arrays.asList(array1);
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(firstList);
        set.retainAll(secondList);
        Integer[] intersection = {};
        intersection = set.toArray(intersection);
        System.out.println("Intersection of arrays: "+Arrays.toString(intersection));
    }

    /**
     * Prints intersection and union of two arrays
     */
    public static void performTask() {
        Integer[] arr1 = {1, 4, 5, 3, 2, 1, 5, 6, 7};
        Integer[] arr2 = {4, 3, 7, 6, 4, 10, 12, 13, 5};
        System.out.println("First array: "+Arrays.toString(arr1));
        System.out.println("Second array: "+Arrays.toString(arr2));
        displayUnion(arr1, arr2);
        displayIntersection(arr1, arr2);
    }
}

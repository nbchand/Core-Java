package com.infodev.extras.FileHandling;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-02
 */
public class MostRepeatedNumber {
    /**
     * Identifies the maximum occurred number in an array
     * @param args
     */
    public static void main(String[] args) {
        //our array
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,1,2,1,2,3,4,5,6};
        Map<Integer,Integer> myMap = new HashMap<>();
        //adds array data to map also sets the occurrence of the numbers as the value
        for (int a : arr){
            //if number already exists increment its value by 1
            if(myMap.containsKey(a)){
                myMap.put(a,myMap.get(a)+1);
            }
            //if number doesn't exist in the map assign it as the key and its value as 1
            else {
                myMap.put(a,1);
            }
        }
        //to store maximum entry
        Map.Entry<Integer, Integer> maxEntry = null;
        //To find extract the key with maximum value
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        //prints result
        System.out.println("The maximum occured number is: "+maxEntry.getKey()+" with "+maxEntry.getValue()+" occurrence.");
    }
}

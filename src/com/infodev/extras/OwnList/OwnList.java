package com.infodev.extras.OwnList;

import java.util.Arrays;

/**
 * A simple list to store and remove data
 * @author Narendra
 * @version 1.0
 * @since 2022-02-02
 */
public class OwnList<T> {

    //array to store data
    private T[] arr = (T[]) new Object[1];
    //index where item needs to be inserted
    Integer index = 0;

    /**
     * Adds item to the list
     * @param item item to be added to the list
     */
    public void add(T item) {
        if (index == 0) {
            arr[index] = item;
            index++;
            return;
        }
        T[] temp = (T[]) new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
        arr[index] = item;
        index++;
    }

    /**
     * Removes the first occurrence of the item from the list
     * @param item item to be removed
     */
    public void remove(T item) {
        //returns if the array doesn't contain the item
        if(!Arrays.asList(arr).contains(item)){
            return;
        }
        //initialize removal index for future use
        int removalIndex = -1;
        //first finds the removal index and after shifts the value by one index
        for (int i = 0; i < arr.length; i++) {
            //if the item is found, its index is stored
            if (arr[i] == item) {
                removalIndex = i;
            }
            if (i >= removalIndex && i < arr.length && removalIndex >= 0) {
                if (i == arr.length - 1) {
                    arr[i] = null;
                } else {
                    arr[i] = arr[i + 1];
                    index--;
                }
            }
        }
        //if the last item of the array is null assign the items to a new array with length as previous length - 1
        if (arr[arr.length - 1] == null) {
            T[] temp = (T[]) new Object[arr.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }

    /**
     * Returns the size of the list
     * @return size of the list
     */
    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

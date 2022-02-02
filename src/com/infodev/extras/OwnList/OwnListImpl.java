package com.infodev.extras.OwnList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-02
 */
public class OwnListImpl {
    public static void main(String[] args) {
        OwnList<String> mylist = new OwnList<>();
        mylist.add("Messi");
        mylist.add("Neymar");
        mylist.add("Ronaldo");
        mylist.add("Zlatan");
        mylist.add("Torres");
        mylist.remove("Torres");
        System.out.println(mylist);
    }
}

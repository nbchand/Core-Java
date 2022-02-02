package com.infodev.extras.FlatMapDemo;
/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-02
 */
import java.util.*;

class MapEg {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("nepal");
        items.add("india");
        items.add("china");

        items.stream().map(string -> string.charAt(0))
                .forEach(System.out::println);
    }
}
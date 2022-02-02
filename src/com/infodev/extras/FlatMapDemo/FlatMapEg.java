package com.infodev.extras.FlatMapDemo;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-02
 */
import java.util.*;
import java.util.stream.Stream;

class FlatMapEg {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("nepal");
        items.add("india");
        items.add("china");

        items.stream().flatMap(string -> Stream.of(string.charAt(0)))
                .forEach(System.out::println);
    }
}
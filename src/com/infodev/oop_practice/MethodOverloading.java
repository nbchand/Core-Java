/*
 1. Write a method that overloads the talk method by taking in a name and
printing “Hello” with that name
 */
package com.infodev.oop_practice;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class MethodOverloading {
    public void displayMessage() {
        System.out.println("Hello");
    }

    public void displayMessage(String name) {
        System.out.println("Hello "+name);
    }
    public static void performTask() {
        MethodOverloading obj = new MethodOverloading();
        //method overloading example
        obj.displayMessage();
        obj.displayMessage("John");
    }
}

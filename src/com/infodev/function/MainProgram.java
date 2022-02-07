/*
1. Create a class called MainProgram and inside the class create a function called
display() with no parameters and inside a body of display method add a line
“Hello, I am called”. Call the function from the main method of MainProgram by
creating the object of MainProgram.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class MainProgram {
    public void display(){
        System.out.println("Hello, I am called");
    }

    /**
     * Calls display()
     */
    public static void performTask() {
        MainProgram obj = new MainProgram();
        obj.display();
    }
}

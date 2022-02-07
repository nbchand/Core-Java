/*
12.WAP to demonstrate anonymous inner class using both techniques (class: may
be abstract or concrete and interface) .
 */
package com.infodev.inner_class;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class AnonymousUsingClass {
    /**
     * Shows the ways to use an anonymous inner class
     */
    public static void performTask() {
        //only a single object of anonymous inner class can be created
        InnerClass obj = new InnerClass() {
            //we need to implement the abstract method here
            void printMessage() {
                System.out.println("Hello world!");
            }
        };
        //implemented method is invoked
        obj.printMessage();
    }
}

/**
 * Anonymous inner class using abstract class.
 */
abstract class InnerClass {
    abstract void printMessage();
}

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
public class AnonymousUsingInterface {
    /**
     * Shows the ways to use an anonymous inner class
     */
    public static void performTask() {
        //only a single object of inner class can be instantiated
        Inner obj = new Inner() {
            //our own implementation of the method
            public void printMessage() {
                System.out.println("Hello world!");
            }
        };
        //implemented method is invoke
        obj.printMessage();
    }
}
/**
 * Anonymous inner class using interface
 */
interface Inner {
    void printMessage();
}

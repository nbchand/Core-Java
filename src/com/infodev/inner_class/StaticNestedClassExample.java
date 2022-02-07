//9. WAP that contains the static nested class.
package com.infodev.inner_class;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class StaticNestedClassExample {

    private static int num = 6;

    /**
     * Inner class within StaticNestedClassExample class
     */
    static class InnerClass {
        /**
         * Just prints hello world!
         */
        void promptMessage() {
            System.out.println("Hello world!");
        }

        /**
         * Demo of an inner class using static variable of outer class
         */
        //static inner class can only access static variable of the outer class
        void displayData() {
            System.out.println("The value of number of outer class is " + num);
        }
    }

    /**
     * Instantiates inner class object and calls its methods
     */
    public static void performTask() {
        //way to initialize an instance of a static inner class
        StaticNestedClassExample.InnerClass innerClass = new StaticNestedClassExample.InnerClass();
        //promptMessage() of InnerClass is invoked
        innerClass.promptMessage();
        //displayData() which prints static variable of outer class is invoked
        innerClass.displayData();
    }
}

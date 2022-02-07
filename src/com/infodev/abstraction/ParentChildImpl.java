/*
1. Create an abstract class 'Parent' with a method 'message'. It has two subclasses
each having a method with the same name 'message' that prints "This is first
subclass" and "This is second subclass" respectively. Call the methods 'message'
by creating an object for each subclass.
 */
package com.infodev.abstraction;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class ParentChildImpl {
    public static void performTask() {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        child1.message();
        child2.message();
    }
}

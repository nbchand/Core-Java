/*
1. Create a class with a method that prints "This is parent class" and its subclass
with another method that prints "This is child class". Now, create an object for
each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
 */
package com.infodev.inheritance;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class ChildClass extends ParentClass {
    public void displayChild(){
        System.out.println("This is child class");
    }
}
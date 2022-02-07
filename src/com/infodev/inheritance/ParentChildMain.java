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
public class ParentChildMain {
    /**
     * Instantiates parent and child classes and calls their methods
     */
    public static void performTask() {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.displayParent();
        child.displayChild();
        child.displayParent();
    }
}

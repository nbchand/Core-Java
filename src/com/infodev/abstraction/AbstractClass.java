/*
4. An abstract class has a constructor which prints "This is constructor of abstract
class", an abstract method named 'a_method' and a non-abstract method which
prints "This is a normal method of abstract class". A class 'SubClass' inherits the
abstract class and has a method named 'a_method' which prints "This is abstract
method". Now create an object of 'SubClass' and call the abstract method and the
non-abstract method. (Analyse the result)
 */
package com.infodev.abstraction;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is the constructor of abstract class");
    }

    public abstract void a_method();

    public void displayMessage() {
        System.out.println("This is normal method of abstract class");
    }
}

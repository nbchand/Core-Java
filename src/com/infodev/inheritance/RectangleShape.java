/*
3. Create a class named 'Shape' with a method to print "This is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class,
both having a method to print "This is rectangular shape" and "This is circular
shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method
to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle'
class by the object of 'Square' class.
 */
package com.infodev.inheritance;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class RectangleShape extends Shape {
    @Override
    public void display() {
        System.out.println("This is rectangle");
    }
}

/*
2. Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with
its constructor having a parameter for its side (suppose s) calling the constructor
of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and
a square.
 */
package com.infodev.inheritance;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area: " + (length * breadth));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}

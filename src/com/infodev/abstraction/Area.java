/*
6. We have to calculate the area of a rectangle, a square and a circle. Create an
abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking
two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area'
containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for
printing the area of rectangle, square and circle respectively. Create an object of
class 'Area' and call all the three methods.
 */
package com.infodev.abstraction;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class Area extends Shape {
    @Override
    public void circleArea(int radius) {
        float area = (22f / 7f) * radius * radius;
        System.out.println("The area of circle is: " + area);
    }

    @Override
    public void squareArea(int side) {
        float area = side * side;
        System.out.println("The area of square is: " + area);
    }

    @Override
    public void rectangleArea(int length, int breadth) {
        float area = length * breadth;
        System.out.println("The area of rectangle is: " + area);
    }
}

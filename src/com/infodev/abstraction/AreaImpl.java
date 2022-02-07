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
public class AreaImpl {
    /**
     * Calculates area of circle, square and rectangle
     */
    public static void performTask() {
        Area area = new Area();
        area.circleArea(7);
        area.squareArea(10);
        area.rectangleArea(5, 12);
    }
}

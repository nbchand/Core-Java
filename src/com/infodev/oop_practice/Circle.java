/*
5. Write an object-oriented programming to find the area and perimeter of the
circle.
 */
package com.infodev.oop_practice;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void calculatePerimeter(){
        float perimeter = 2*(22f/7f)*radius;
        System.out.println("Perimeter: "+perimeter);
    }

    public void calculateArea(){
        float area = (22f/7f)*radius*radius;
        System.out.println("Area: "+area);
    }

    public static void performTask() {
        Circle circle = new Circle(7);
        circle.calculatePerimeter();
        circle.calculateArea();
    }
}

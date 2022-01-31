/*
4. Write a program to print the area and perimeter of a triangle having sides of 3, 4
and 5 units by creating a class named 'Triangle' without any parameter in its
constructor.

 */
package com.infodev.class_and_object;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class Triangle {
    private int a;
    private int b;
    private int c;

    //getters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getPerimeter(){
        return (a+b+c);
    }

    /**
     * Calculates the area of a triangle having 3 sides
     * @return The area of the triangle which is calculated using Heron's formula
     */
    public float getArea(){
        float s = (float) getPerimeter()/2;
        float underRoot = s*(s-a)*(s-b)*(s-c);
        //since area of triangle = (s*(s-a)*(s-b)*(s-c))^(1/2)
        //where s is semi perimeter of the triangle and a.b.c are sides of it
        float area = (float) Math.pow(underRoot,0.5);
        return area;
    }

    /**
     * Sets side of triangle and calculates its area as well as perimeter
     */
    public static void performTask() {
        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);

        System.out.println("The perimeter of the triangle is "+triangle.getPerimeter());
        System.out.println("The area of the triangle is "+triangle.getArea());
    }
}

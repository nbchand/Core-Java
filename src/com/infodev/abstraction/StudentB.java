/*
3. We have to calculate the percentage of marks obtained in three subjects (each out
of 100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by
two other classes 'A' and 'B' each having a method with the same name which
returns the percentage of the students. The constructor of student A takes the
marks in three subjects as its parameters and the marks in four subjects as its
parameters for student B. Create an object for each of the two classes and print the
percentage of marks for both the students
 */
package com.infodev.abstraction;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class StudentB extends Marks {
    private float sub1, sub2, sub3, sub4, sub5;

    public StudentB(float sub1, float sub2, float sub3, float sub4, float sub5) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    @Override
    public void getPercentage() {
        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 3;
        System.out.println("Student B obtained " + percentage + "%");
    }
}

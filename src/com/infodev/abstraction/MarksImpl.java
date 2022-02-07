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
public class MarksImpl {
    /**
     * Calculates percentage of two students
     */
    public static void performTask() {
        StudentA studentA = new StudentA(50, 80, 60);
        StudentB studentB = new StudentB(70, 90, 80, 95, 87);

        studentA.getPercentage();
        studentB.getPercentage();
    }
}

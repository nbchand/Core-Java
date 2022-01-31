/*
2. Create a class named 'Student' with String variable 'name' and integer variable
'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating
an object of the class Student.

3. Assign and print the roll number, phone number and address of two students
having names "Sam" and "John" respectively by creating two objects of class
'Student'.

 */
package com.infodev.class_and_object;

/**
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class Student {

    private String name;
    private Integer roll_no;
    private String phoneNumber;
    private String address;

    //used in Q.N.2)
    //parameterized constructor which only assigns name and roll_no
    public Student(String name, Integer roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    //used in Q.N.3)
    //parameterized constructor which assigns values to all the instance variables
    public Student(String name, Integer roll_no, String phoneNumber, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * Assigns name and roll_no a student object
     */
    public static void performTask() {
        //initializes a student object and assigns values to name and roll_no using a parameterized constructor
        Student student = new Student("John", 2);
        //displays results
        System.out.println("Name of the student is " + student.name);
        System.out.println("Roll no. of the student is " + student.roll_no);
    }

    /**
     * Creates two instances of the class Student assigning all the possible values and displays the result
     */
    public static void handleTwoObjects() {

        //initializes value to two objects using parameterized constructor
        Student student1 = new Student("Sam", 1, "9800000000", "China");
        Student student2 = new Student("John", 2, "9811111111", "U.S");

        //displays the information of first object
        System.out.println("The first student is:");
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No.: " + student1.roll_no);
        System.out.println("Phone No.: " + student1.phoneNumber);
        System.out.println("Address: " + student1.address);

        //displays the information of second object
        System.out.println("\nThe first student is:");
        System.out.println("Name: " + student2.name);
        System.out.println("Roll No.: " + student2.roll_no);
        System.out.println("Phone No.: " + student2.phoneNumber);
        System.out.println("Address: " + student2.address);
    }
}

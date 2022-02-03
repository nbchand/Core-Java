/*
9. Write a program that would print the information (name, year of joining, salary,
address) of three employees by creating a class named 'Employee'. The output
should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreet
Sam 2000 68D- WallsStreet
John 1999 26B- WallsStreet
 */
package com.infodev.class_and_object;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-03
 */
public class Employee {

    private String name;
    private int joinYear;
    private String address;
    private float salary;

    /**
     * Constructor to instantiate the object
     * @param name
     * @param joinYear
     * @param address
     * @param salary
     */
    public Employee(String name, int joinYear, String address, float salary) {
        this.name = name;
        this.joinYear = joinYear;
        this.address = address;
        this.salary = salary;
    }

    /**
     * Displays a String whenever the object of this class is supplied to System.out.println()
     * @return Information regarding the object
     */
    @Override
    public String toString() {
        return name + "\t\t" + joinYear + "\t\t\t" + address + "\t\t" + salary;
    }

    /**
     * Instantiate 3 objects and display them using toString()
     */
    public static void performTask() {
        Employee employee1 = new Employee("Robert", 1994, "64C-WallsStreet", 300000f);
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet", 100000f);
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet", 200000f);

        System.out.println("Name\t\tYear of Joining\t\tAddress\t\t\tSalary");
        System.out.println(employee1);//toString() is called
        System.out.println(employee2);
        System.out.println(employee3);
    }
}

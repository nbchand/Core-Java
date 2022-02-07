/*
11. WAP to demonstrate member inner class.
 */
package com.infodev.inner_class;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class MemberInnerClassExample {
    //instance variable
    private int value;

    /**
     * It is member inner class also known as regular inner class. It can access the properties of outer class.
     */
    class MemberClass{
        /**
         * Prints the value of outer instance variable
         */
        void showOuterData(){
            System.out.println("Value of outer variable is "+value);
        }
    }

    /**
     * Constructor for outer class
     * @param value value for instance variable
     */
    public MemberInnerClassExample(int value) {
        this.value = value;
    }

    /**
     * Instance objects of both inner class and out class as well as calls the method of inner class
     */
    public static void performTask() {
        //object of outer class is instantiated
        MemberInnerClassExample obj = new MemberInnerClassExample(10);
        //way to instantiate member inner class
        MemberInnerClassExample.MemberClass innerObj = obj.new MemberClass();
        //invokes method of inner class
        innerObj.showOuterData();
    }
}

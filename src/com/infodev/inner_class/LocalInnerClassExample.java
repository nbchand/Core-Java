/*
10.WAP that contains the local inner class
 */
package com.infodev.inner_class;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class LocalInnerClassExample {
    /**
     * A method where local class is created
     */
    public void showLocalDemo(){
        /**
         * It is a local inner class. A local inner class is a class which is created inside a block,
         * the block can be a method, for loop and many more.
         */
        class LocalInner{
            /**
             * Just prints hello world!
             */
            void printMessage(){
                System.out.println("Hello World!");
            }
        }
        //object of local inner class is instantiated inside the showLocalDemo()
        LocalInner localInner = new LocalInner();
        //printMessage() of local class is invoked
        localInner.printMessage();
    }

    /**
     * Demonstrates the uses of a Local inner class
     */
    public static void performTask() {
        LocalInnerClassExample obj = new LocalInnerClassExample();
        //showLocalDemo() creates our local class and instantiates its object as well as calls its methods
        obj.showLocalDemo();
    }
}

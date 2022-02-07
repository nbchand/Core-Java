/*
5. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now
create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class
'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class
'Animals'. Now create an object for each of the subclasses and call their respective
methods.
 */
package com.infodev.abstraction;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class AnimalsImpl {
    /**
     * Calls cats() and dogs() of Animals class
     */
    public static void performTask() {
        Cats cats = new Cats();
        Dogs dogs = new Dogs();
        cats.cats();
        dogs.dogs();
    }
}

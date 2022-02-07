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
public class Dogs extends Animals{
    @Override
    public void cats() {

    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}

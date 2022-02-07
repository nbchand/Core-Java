/*
3. Create an interface named AnimalEat and AnimalTravel. And create a
class Animal which implements above two interfaces.
 */
package com.infodev.oop_practice;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class Animal implements AnimalEat,AnimalTravel{

    @Override
    public void eat() {
        System.out.println("Animal started to eat.");
    }

    @Override
    public void travel() {
        System.out.println("Animal started to walk.");
    }

    public static void performTask() {
        Animal animal = new Animal();
        animal.eat();
        animal.travel();
    }
}

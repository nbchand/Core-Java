package com.infodev.main_classes;

import com.infodev.oop_practice.Animal;
import com.infodev.oop_practice.Circle;
import com.infodev.oop_practice.MethodOverloading;

/**
 * A main class to run all other classes in the package com.infodev.oop_practice
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class OOPMain {
    public static void main(String[] args) {
        //Q.N. 1)
        MethodOverloading.performTask();
        //Q.N. 2)
        //created an interface named Test with talk() and walk() methods
        //Q.N. 3)
        Animal.performTask();
        //Q.N. 4) is already done in class_and_object
        //Q.N. 5)
        Circle.performTask();
        //the rest of the task of this set is already done class_and_object as all the questions are similar
    }
}

package com.infodev.main_classes;

import com.infodev.class_and_object.Area;
import com.infodev.class_and_object.Student;
import com.infodev.class_and_object.Triangle;

/**
 * A main class to run all other classes in the package com.infodev.class_and_object
 * @author Narendra
 * @version 1.0
 * @since 1/31/2022
 */
public class ClassAndObjectMain {
    public static void main(String[] args) {
        //Q.N. 1)
        Area.performTask();
        //Q.N. 2)
        Student.performTask();
        //Q.N. 3)
        Student.handleTwoObjects();
        //Q.N. 4)
        Triangle.performTask();
    }
}

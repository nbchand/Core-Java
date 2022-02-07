package com.infodev.main_classes;

import com.infodev.abstraction.*;

/**
 * A main class to run all other classes in the package com.infodev.abstraction
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class AbstractionMain {
    public static void main(String[] args) {
        //Q.N. 1)
        ParentChildImpl.performTask();
        //Q.N. 2)
        BankImpl.performTask();
        //Q.N. 3)
        MarksImpl.performTask();
        //Q.N. 4)
        AbstractImpl.performTask();
        //Q.N. 5)
        AnimalsImpl.performTask();
        //Q.N. 6)
        AreaImpl.performTask();
    }
}

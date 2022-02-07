package com.infodev.main_classes;

import com.infodev.inner_class.*;

/**
 * A main class to run all other classes in the package com.infodev.inner_class
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class InnerClassMain {
    public static void main(String[] args) {
        //Q.N 9)
        StaticNestedClassExample.performTask();
        //Q.N 10)
        LocalInnerClassExample.performTask();
        //Q.N 11)
        MemberInnerClassExample.performTask();
        //Q.N 12)
        AnonymousUsingClass.performTask();
        //Q.N 12)
        AnonymousUsingInterface.performTask();
    }
}

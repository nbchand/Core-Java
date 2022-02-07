/*
5. A person is eligible to vote if his/her age is greater than or equal to 18. Define a
method to find out if he/she is eligible to vote.
 */
package com.infodev.function;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-08
 */
public class VotingEligibility {

    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Checks voting eligibility
     */
    public static void performTask() {
        int age=17;
        if(isEligible(age)){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("Sorry, you can't vote");
        }
    }
}

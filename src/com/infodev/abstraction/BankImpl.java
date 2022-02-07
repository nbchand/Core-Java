/*
2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150
and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and
'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.
 */
package com.infodev.abstraction;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class BankImpl {
    /**
     * Deals with bank subclasses
     */
    public static void performTask() {
        BankA bankA = new BankA(100);
        BankB bankB = new BankB(150);
        BankC bankC = new BankC(200);

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}

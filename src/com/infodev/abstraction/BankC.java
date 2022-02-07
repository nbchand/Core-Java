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
public class BankC extends Bank {
    private int balance;

    public BankC(int balance) {
        this.balance = balance;
    }

    @Override
    public void getBalance() {
        System.out.println("Bank C balance: $"+balance);
    }
}

package com.bank.core;

/**
 * Fundamental bank account entity holding balance and deposit logic.
 */
public class Account {

    // Member 2 will modify this value during the Incremental Build demo!
    public static final double DEFAULT_INITIAL_BALANCE = 1000.00;

    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = DEFAULT_INITIAL_BALANCE;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        this.balance += amount;
        return this.balance;
    }
}

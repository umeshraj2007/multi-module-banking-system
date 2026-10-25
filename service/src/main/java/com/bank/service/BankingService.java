package com.bank.service;

import com.bank.core.Account;

public class BankingService {

    private final Account account;

    public BankingService(String accountNumber, String accountHolder) {
        this.account = new Account(accountNumber, accountHolder);
    }

    public String getAccountSummary() {
        return String.format("Account [%s] | Holder: %s",
                account.getAccountNumber(),
                account.getAccountHolder());
    }

    public double getCurrentBalance() {
        return account.getBalance();
    }

    public double processDeposit(double amount) {
        System.out.printf("[Service Layer] Validating deposit request of: $%.2f%n", amount);

        if (amount > 1_000_000.00) {
            throw new IllegalArgumentException(
                    "Deposit exceeds maximum single-transaction limit of $1,000,000.");
        }

        return account.deposit(amount);
    }
}

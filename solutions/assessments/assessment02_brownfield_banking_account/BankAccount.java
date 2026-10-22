package assessments.assessment02_brownfield_banking_account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final List<String> log = new ArrayList<>();

    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (Double.isNaN(initialBalance) || initialBalance < 0.0) {
            throw new IllegalArgumentException("Initial balance cannot be negative or NaN");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.log.add("Account opened with balance: " + initialBalance);
    }

    public synchronized void deposit(double amount) {
        if (Double.isNaN(amount) || amount <= 0.0) {
            throw new IllegalArgumentException("Deposit amount must be strictly positive");
        }
        this.balance += amount;
        log.add("Deposit: " + amount);
    }

    public synchronized boolean withdraw(double amount, double fee) {
        if (Double.isNaN(amount) || amount <= 0.0 || Double.isNaN(fee) || fee < 0.0) {
            throw new IllegalArgumentException("Withdrawal amount and fee must be valid");
        }
        double totalRequired = amount + fee;
        if (this.balance < totalRequired) {
            return false; // Do NOT deduct fee on failure
        }
        this.balance -= totalRequired;
        log.add("Withdrawal: " + amount + " (Fee: " + fee + ")");
        return true;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized List<String> getAuditLog() {
        return Collections.unmodifiableList(new ArrayList<>(log));
    }
}

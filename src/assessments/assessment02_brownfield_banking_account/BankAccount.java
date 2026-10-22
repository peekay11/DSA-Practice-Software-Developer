package assessments.assessment02_brownfield_banking_account;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    // BUGGY LEGACY CODE: prone to race conditions and invalid balances
    private String accountNumber;
    private double balance;
    private List<String> log = new ArrayList<>();

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        // Missing checks!
        this.balance += amount;
        log.add("Deposit: " + amount);
    }

    public boolean withdraw(double amount, double fee) {
        // Bug: charges fee even when withdraw fails, not thread safe!
        this.balance -= fee;
        if (this.balance >= amount) {
            this.balance -= amount;
            log.add("Withdraw: " + amount);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getAuditLog() {
        return log;
    }
}

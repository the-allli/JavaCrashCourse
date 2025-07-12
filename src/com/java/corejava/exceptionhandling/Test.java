package com.java.corejava.exceptionhandling;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class with withdrawal method
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Not enough balance!");
            }
            balance -= amount;
            System.out.println("Transaction successful! New balance: " + balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Logging transaction attempt...");
        }
    }
}


public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial balance
        try {
            account.withdraw(6000); // Trying to withdraw more than the balance
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}

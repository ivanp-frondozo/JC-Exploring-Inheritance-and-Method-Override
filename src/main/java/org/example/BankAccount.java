package org.example;

public class BankAccount {
    private double balance; //from private to protected

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {
    private double fee = 0.5;

    public CheckingAccount(double startingBalance) {
        super(startingBalance);
    }

    public void deductMonthlyFee() {
        double newBalance = getBalance() - fee;
        setBalance(newBalance);
        System.out.println("Fee deducted. New balance: " + getBalance());
    }
}

package org.learning.oop.bank;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String ownerName;
    private BigDecimal balance;

    // Constructor
    public Account(String ownerName, int accountNumber) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    // Setter
    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public String getAccountInfo() {
        return "Numero del conto: " + this.accountNumber + ", Proprietario: " + this.ownerName + ", Saldo: " + this.balance + "€";
    }

    // Methods
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public boolean withdraw(BigDecimal amount) {
        if (this.balance.compareTo(amount) >= 0) {
            this.balance = this.balance.subtract(amount);
            return true;
        } else {
            return false;
        }
    }
}
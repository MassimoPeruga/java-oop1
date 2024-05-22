package org.learning.oop.bank;

import java.math.BigDecimal;
import java.util.Random;

public class Account {
    private final int accountNumber;
    private String ownerName;
    private BigDecimal balance;

    // Constructor
    public Account(String ownerName) {
        this.ownerName = valueOrDefault(ownerName);
        this.accountNumber = new Random().nextInt(1,1000);
        this.balance = BigDecimal.ZERO;
    }

    // Setter
    public void setOwnerName(String ownerName) {
        this.ownerName = valueOrDefault(ownerName);
    }

    // Getter
    public String getOwnerName() {
        return this.ownerName;
    }
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
    private String valueOrDefault(String value){
        if (!value.isEmpty()){
            return value;
        } else {
            return "User";
        }
    }

    public boolean deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(amount);
            return true;
        } else {
            return false;        }
    }

    public boolean withdraw(BigDecimal amount) {
        if(balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }
}
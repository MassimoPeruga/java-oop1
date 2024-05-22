package org.learning.oop.bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String name = scanner.nextLine();
        Account account = new Account(name);
        System.out.println("Account creato. " + account.getAccountInfo());

        while(true) {
            System.out.print("Cosa vuoi fare? (1: depositare) - (2: prelevare) - (3: uscire): ");
            String input = scanner.nextLine();

            switch (input) {
                case "1" :
                    System.out.println("******************************");
                    System.out.print("Quale somma vuoi depositare? (€): ");
                    BigDecimal amountToDeposit = new BigDecimal(scanner.nextLine());
                    boolean deposit = account.deposit(amountToDeposit);
                    if (deposit) {
                        System.out.println("Deposito riuscito. " + account.getAccountInfo());
                    } else {
                        System.out.println("Operazione fallita.");
                    }
                    break;
                case "2":
                    System.out.println("******************************");
                    System.out.print("Quale somma vuoi prelevare? (€): ");
                    boolean withdraw = account.withdraw(new BigDecimal(scanner.nextLine()));
                    if(withdraw){
                        System.out.println("Prelievo riuscito. " + account.getAccountInfo());
                    } else {
                        System.out.println("Saldo insufficente.");
                    }
                    break;
                case "3" : return;
            }
        }
    }
}
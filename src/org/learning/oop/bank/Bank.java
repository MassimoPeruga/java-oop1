package org.learning.oop.bank;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String name = scanner.nextLine();
        int accountNumber = new Random().nextInt(1000) + 1;
        Account account = new Account(name, accountNumber);
        System.out.println("Account creato. " + account.getAccountInfo());

        while (true) {
            System.out.println("Cosa vuoi fare? 1: Depositare, 2: Prelevare, 3: Uscire");
            int choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
            System.out.print("Inserisci la somma: ");
            BigDecimal amount = scanner.nextBigDecimal();
            if (choice == 1) {
                account.deposit(amount);
                System.out.println("Deposito completato. " + account.getAccountInfo());
            } else if (choice == 2) {
                if (account.withdraw(amount)) {
                    System.out.println("Prelievo completato. " + account.getAccountInfo());
                } else {
                    System.out.println("Operazione fallita, saldo insufficente.");
                }
            }
        }
        scanner.close();
    }
}
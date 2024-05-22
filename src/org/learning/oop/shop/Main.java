package org.learning.oop.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione di un nuovo prodotto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Descrizione: ");
        String description = scanner.nextLine();
        System.out.print("Prezzo in €: ");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        System.out.print("IVA in %: ");
        BigDecimal vat = new BigDecimal(scanner.nextLine());
        // Costruttore
        Product product = new Product(name, description, price, vat);

        // Test
        System.out.println("Nome Esteso: " + product.getFullName());
        System.out.println("Descrizione: " + product.getDescription());
        System.out.println("Prezzo Base: " + product.getPrice() + "€");
        System.out.println("IVA: " + product.getVat()+ "%");
        System.out.println("Prezzo con IVA inclusa: " + product.getFullPrice() + "€");

        scanner.close();
    }
}
package org.learning.oop.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Creazione di un nuovo prodotto
        Product product = new Product("Product1", "Description1", new BigDecimal("100.0"), new BigDecimal("22.0"));

        // Test
        System.out.println("Codice: " + product.getCode());
        System.out.println("Nome: " + product.getName());
        System.out.println("Descrizione: " + product.getDescription());
        System.out.println("Prezzo: " + product.getPrice() + "€");
        System.out.println("IVA: " + product.getVat()+ "%");
        System.out.println("Prezzo Base: " + product.getBasePrice() + "€");
        System.out.println("Prezzo IVA: " + product.getPriceWithVat() + "€");
        System.out.println("Nome Esteso: " + product.getExtendedName());
    }
}
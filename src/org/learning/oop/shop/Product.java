package org.learning.oop.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // Attributi
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    // Costruttore
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        this.code = new Random().nextInt(999); // generazione di un codice casuale
        this.name = name;
        this.description = description;
        this.price = price.setScale(2, RoundingMode.HALF_UP);
        this.vat = vat.setScale(2, RoundingMode.HALF_UP);
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.HALF_UP);
    }


    public void setVat(BigDecimal vat) {
        this.vat = vat.setScale(2, RoundingMode.HALF_UP);
    }

    // Getter
    public String getCode() {
        return String.format("%06d", this.code); // restituisce il codice come stringa con padding a sinistra
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public BigDecimal getVat() {
        return this.vat;
    }

    public BigDecimal getBasePrice() {
        return this.price;
    }

    public BigDecimal getPriceWithVat() {
        return this.price.multiply(this.vat.divide(BigDecimal.valueOf(100)).add(BigDecimal.ONE)).setScale(2, RoundingMode.HALF_UP);
    }

    public String getExtendedName() {
        return getCode() + "-" + this.name;
    }
}
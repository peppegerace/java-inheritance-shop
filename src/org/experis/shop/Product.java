package org.experis.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    private static final int MAX_CODE = 100000000;

    // ATTRIBUTI
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal vat;


    // COSTRUTTORI
    public Product (String name, String brand, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;

        this.code = generateCode();
    }

    // METODI
    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand() {
        this.brand = brand;
    }
    public BigDecimal getPrice() {
        return price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public void setPrice() {
        if (price == null) {
            price = BigDecimal.ZERO;
        }
        this.price = price;
    }
    public BigDecimal getVat() {
        return vat;
    }
    public void setVat() {
        this.vat = vat;
    }
    public String getFullName() {
        return String.format("%08d_%s", code, name);
    }
    public BigDecimal getFullPrice() {
        BigDecimal vatRate = this.vat.divide(BigDecimal.valueOf(100));
        BigDecimal totalPrice = price.add(price.multiply(vatRate));
        return totalPrice.setScale(2, RoundingMode.HALF_EVEN);
    }
    private int generateCode() {
        Random randomGenrator = new Random();
        return randomGenrator.nextInt(MAX_CODE);
    }

    public String productDetails() {
        return String.format("Code Product: %s, Name: %s, Brand %s, Net Price: %.2f€, Vat: %.0f%%, Total Price: %.2f€",
                getFullName(), name, brand, price, vat, getFullPrice());
    }

}


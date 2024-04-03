package org.experis.shop;

import java.math.BigDecimal;

public class Headphones extends Product {
    // ATTRIBUTI
    private String color;
    private boolean isWireless;

    // COSTRUTTORE
    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    // GETTER AND SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    // METODI
    @Override
    public String productDetails(){
        return super.productDetails() + ", Colore: " + color + ", Wireless: " + (isWireless ? "Sì" : "No");
    }
}

package org.experis.shop;

import java.math.BigDecimal;

public class Television extends Product{
    // ATTRIBUTI
    private int screenSize;
    private boolean isSmart;

    // COSTRUTTORE
    public Television(String name, String brand, BigDecimal price, BigDecimal vat, int screenSize, boolean isSmart) {
        super(name, brand, price, vat);
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }
    // GETTER AND SETTER
    public int getScreenSize() {
        return screenSize;
    }
    public void setScreenSize() {
        this.screenSize = screenSize;
    }
    public boolean isSmart() {
        return isSmart;
    }
    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    // METODI
    @Override
    public String productDetails(){
        return super.productDetails() + ", Dimensione: " + screenSize + ", Smart TV: " + (isSmart ? "Sì" : "No");
    }
}

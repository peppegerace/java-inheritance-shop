package org.experis.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    // ATTRIBUTI
    private String imei;
    private int memorySize;

    // COSTRUTTORE
    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, String imei, int memorySize) {
       super(name, brand, price, vat);
       this.imei = imei;
       this.memorySize = memorySize;
    }

    // GETTER AND SETTER
    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    // METODI
    @Override
    public String productDetails(){
        return super.productDetails() + ", Codice IMEI: " + imei + ", Memoria: " + memorySize + " GB";
    }
}

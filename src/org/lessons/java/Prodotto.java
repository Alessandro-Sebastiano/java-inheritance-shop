package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    public Prodotto(String name, String description, double price, double iva) {
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    private int generateCode(){
        Random rand = new Random();
        return rand.nextInt(1, 1001);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }

    public String getPriceIva(){
        DecimalFormat format = new DecimalFormat("##.##");
        return format.format(price + (price * iva) / 100);
    }

    public double getDiscout(boolean haveCard){

             return this.price -= (getPrice() * 2) / 100;

    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}

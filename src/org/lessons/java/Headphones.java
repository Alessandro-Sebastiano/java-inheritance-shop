package org.lessons.java;

public class Headphones extends Prodotto{

    private String color;
    private boolean wireless;

    public Headphones(String name, String description, double price, double iva, String color, boolean wireless) {
        super(name, description, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public double getDiscout(boolean haveCard) {
        if(wireless){
            double price = getPrice();
            price -= (getPrice() * 7) /100;
            setPrice(price);
            return getPrice();
        }else {
            return super.getDiscout(haveCard);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Headphones{" +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                "} ";
    }
}

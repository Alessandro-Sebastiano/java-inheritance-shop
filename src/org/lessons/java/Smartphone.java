package org.lessons.java;

public class Smartphone extends Prodotto{

    private int imei;
    private int storage;

    public Smartphone(String name, String description, double price, double iva, int imei, int storage){

        super(name, description, price, iva);

        this.imei = imei;
        this.storage = storage;

    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public double getDiscout(boolean haveCard) {
        if (haveCard && getStorage() < 33) {
            double price = getPrice();
            price -= (getPrice() * 5) / 100;
            setPrice(price);
            return getPrice();
        } else {
             return super.getDiscout(haveCard);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Smartphone{" +
                "imei=" + imei +
                ", storage=" + storage +
                '}';
    }

}

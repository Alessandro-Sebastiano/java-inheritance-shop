package org.lessons.java;

public class Television extends Prodotto{

    private String size;
    private boolean smart;

    public Television(String name, String description, double price, double iva, String size, boolean smart){

        super(name, description, price, iva);

        this.size = size;
        this.smart = smart;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public double getDiscout(boolean haveCard) {
        if(smart){
            double price = getPrice();
            price -= (getPrice() * 10) /100;
            setPrice(price);
            return getPrice();
        }else {
            return super.getDiscout(haveCard);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Television{" +
                "size='" + size + '\'' +
                ", smart=" + smart +
                "} ";
    }
}

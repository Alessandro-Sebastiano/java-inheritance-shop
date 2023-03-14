package org.lessons.java;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] arg){

//        Prodotto prod = new Prodotto("Google Pixel", "Smartphone Android", 540, 22);
//        System.out.println(prod);
//
//        Smartphone tcl = new Smartphone("Tcl 20 SE", "Smartphone Android", 130, 22, 11223344, 32);
//        System.out.println(tcl);
//        System.out.println(tcl.getPriceIva());
//
//        Television samsung = new Television("Samsung", "Samsung smart tv", 449, 22, "36 pollici", true);
//        System.out.println(samsung);
//        System.out.println(samsung.getPriceIva());
//
//        Headphones sony = new Headphones("Sony AJGH", "Sony Headphones", 299, 22, "withe", false);
//        System.out.println(sony);
//        System.out.println(sony.getPriceIva());

        Scanner input = new Scanner(System.in);

        Prodotto[] carrello = new Prodotto[5];
        int productsTotal = 5;
        int productsNumber = 0;


        System.out.println("Che tipo di prodotto vuoi aggiungere?");
        System.out.println();
        boolean exit = true;

        while (productsNumber < productsTotal && exit) {

            System.out.println("Opzioni: ");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisione");
            System.out.println("3 - Cuffie");
            System.out.println("4 - Exit");

            if(productsNumber == 0) {
                System.out.println("Nessun prodotto nel carrello");
            }else if (productsNumber == 1){
                System.out.println(productsNumber + " " + "prodotto nel carello");
            }else{
                System.out.println(productsNumber + " " + "prodotti nel carello");
            }

            int option = Integer.parseInt(input.nextLine());

            switch (option) {

                case 1:
                    System.out.println("Inesrisci il nome dello smartphone.");
                    String name = input.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto.");
                    String description = input.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto.");
                    double price = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci l'iva.");
                    double iva = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci l'imei dello smartphone.");
                    int imei = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci la quantità di memoria dello smartphone");
                    int storage = Integer.parseInt(input.nextLine());
                    Smartphone newSmartphone = new Smartphone(name, description, price, iva, imei, storage);
                    carrello[productsNumber] = newSmartphone;
                    ++productsNumber;
                    System.out.println(Arrays.toString(carrello));
                    break;


                case 2:
                    System.out.println("Inesrisci il nome del televisore.");
                    String nameTv = input.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto.");
                    String descriptionTv = input.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto.");
                    double priceTv = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci l'iva.");
                    double ivaTv = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci le dimensioni del televisore.");
                    String size = input.nextLine();
                    System.out.println("Inserisci se il televisore è smart o meno (true o false)");
                    boolean smart = Boolean.parseBoolean(input.nextLine());
                    Television newTelevision = new Television(nameTv, descriptionTv, priceTv, ivaTv, size, smart);
                    carrello[productsNumber] = newTelevision;
                    ++productsNumber;
                    System.out.println(Arrays.toString(carrello));
                    break;


                case 3:
                    System.out.println("Inesrisci il nome delle cuffie.");
                    String nameHe = input.nextLine();
                    System.out.println("Inserisci la descrizione del prodotto.");
                    String descriptionHe = input.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto.");
                    double priceHe = Integer.parseInt(input.nextLine());
                    System.out.println("inserisci l'iva.");
                    double ivaHe = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci il colore delle cuffie.");
                    String color = input.nextLine();
                    System.out.println("Inserisci se le cuffie sono wireless (true o false)");
                    boolean wireless = Boolean.parseBoolean(input.nextLine());
                    Television newHeadphone = new Television(nameHe, descriptionHe, priceHe, ivaHe, color, wireless);
                    carrello[productsNumber] = newHeadphone;
                    ++productsNumber;
                    System.out.println(Arrays.toString(carrello));
                    break;

                case 4:
                    exit = false;
                    System.out.println("Exit");
                    break;


            }


        }


        System.out.println("Hai la carta fedelta?");
        System.out.println("1 - Si");
        System.out.println("2 - No");

        int cardOption = Integer.parseInt(input.nextLine());

        switch (cardOption){

            case 1:
                int i = 0;
                double total = 0;
                System.out.println(carrello.length);
                while (i < productsNumber) {
                    carrello[i].getDiscout(true);
                    total += carrello[i].getPrice();
                    ++i;
                }
                System.out.println("Sconto applicato sui prodotti del carrello.");
                System.out.println("Dettagli carrello:");
                System.out.println(Arrays.toString(carrello));
                System.out.println("Totale: $" + total );
                break;
            case 2:
                System.out.println("Dettagli carrello:");
                System.out.println("Carrello");
        }

    }

}

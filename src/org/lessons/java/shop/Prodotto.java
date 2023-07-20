package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    private String name;
    private String description;
    private Double price;
    private Double iva;

    public Prodotto (String name, String description,Double price, Double iva){
        this.name=name;
        this.description=description;
        this.price=price;
        this.iva=iva;
    }

    public int getCode() {
        return this.codice;
    }

    public String getName() {
        return this.name;
    }
    public String setName() {
       return this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    public String setDescription() {
        return this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }
    public Double setPrice() {
        return this.price = price;
    }

    public Double getIva() {
        return this.iva;
    }
    public Double setIva() {
        return this.iva = iva;
    }

    int createCode (){
        Random randomGenerator = new Random();

      int codice = randomGenerator.nextInt(1, 99999999);

     /*   if (toString(codice).length()<8){

        }*/

        return codice;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice + '\'' +
                "nome='" + name + '\'' +
                ", descrizione='" + description + '\'' +
                ", prezzo='" + price + "$" +'\'' +
                ", iva='" + iva + "%" +'\'' +
                '}';
    }
}

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    private String name;
    private String description;
    private Double price;
    private Double iva;
    private Categoria categoria;

    public Prodotto (String name, String description,Double price, Double iva){
        Random randomGenerator = new Random();


        this.codice=randomGenerator.nextInt(1, 99999999);
        this.name=name;
        this.description=description;
        this.price=price;
        this.iva=iva;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getName() {
        return this.name;
    }
    public void  setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
         this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
         this.price = price;
    }

    public Double getIva() {
        return iva;
    }
    public void  setIva(double iva) {
         this.iva = iva;
    }

    public String taxedPrice(){

        double taxedPriceCalculation= price+(price*(iva/100)) ;

        return taxedPriceCalculation +"$";
    }

    public String extendedName(){

        String codiceString=Integer.toString(codice);

        int digitsNeeded= 8- codiceString.length();

        for(int i=0; i<digitsNeeded; i++){

            codiceString= "0" + codiceString;
        }

        String extendedName= codiceString + "-" + name;

        return extendedName;
    }
    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice+ '\'' +
                "nome='" + name + '\'' +
                ", descrizione='" + description + '\'' +
                ", prezzo='" + price + "$" +'\'' +
                ", iva='" + iva + "%" +'\'' + categoria.getName() + categoria.getDescription() +
                '}';
    }
}

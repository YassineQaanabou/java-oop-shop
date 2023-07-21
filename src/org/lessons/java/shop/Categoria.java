package org.lessons.java.shop;

public class Categoria {
    private String name;
    private String description;

    public Categoria (String name, String description){
        this.name= name;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "categoria prodotto:" + name + "descrizione categoria prodotto:" +description;
    }
}

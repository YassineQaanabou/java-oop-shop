package org.lessons.java.shop;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il nome del prodotto:");
        String name = scan.nextLine();

        System.out.println("inserisci la descrizione del prodotto:");
        String description = scan.nextLine();

        System.out.println("inserisci il prezzo del prodotto:");
        Double price = scan.nextDouble();

        System.out.println("inserisci l'IVA:");
        Double iva = scan.nextDouble();


        System.out.println("inserisci la categoria:");
        String categoryName = scan.nextLine();

        System.out.println("inserisci la descrizione della categoria:");
        String categoryDescription = scan.nextLine();

        Categoria categoria = new Categoria(categoryName, categoryDescription);
        Prodotto prodotto = new Prodotto(name, description, price, iva);

        System.out.println(prodotto);

        System.out.println("il prezzo base del prodotto è " +prodotto.getPrice());
        System.out.println("il prezzo base del prodotto con l'IVA è " +prodotto.taxedPrice());
        System.out.println(prodotto.extendedName());

        scan.close();
    }
}

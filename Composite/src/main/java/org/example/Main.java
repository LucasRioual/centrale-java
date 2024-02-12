package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ElementFleur rose = new Fleur("Rose", 2.0);
        ElementFleur tulipe = new Fleur("Tulipe", 1.5);


        BouquetFleurs bouquet = new BouquetFleurs();
        bouquet.addFleur(rose);
        bouquet.addFleur(tulipe);


        double coutTotal = bouquet.getCost();
        System.out.println("Coût total du bouquet de fleurs : " + coutTotal);
    }
}
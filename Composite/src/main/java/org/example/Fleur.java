package org.example;

public class Fleur implements ElementFleur {
    private String nom;
    private double prix;

    public Fleur(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public double getCost() {
        System.out.println("Coût de la fleur " + nom + ": " + prix);
        return prix;
    }
}

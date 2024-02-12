package org.example;

// Composite
import java.util.ArrayList;
import java.util.List;

public class BouquetFleurs implements ElementFleur {
    private List<ElementFleur> fleurs = new ArrayList<>();

    public void addFleur(ElementFleur fleur) {
        fleurs.add(fleur);
    }

    public void removeFleur(ElementFleur fleur) {
        fleurs.remove(fleur);
    }

    @Override
    public double getCost() {
        double coutTotal = 0.0;
        System.out.println("Coût du bouquet :");

        for (ElementFleur fleur : fleurs) {
            coutTotal += fleur.getCost();
        }

        System.out.println("Coût total du bouquet : " + coutTotal);
        return coutTotal;
    }
}

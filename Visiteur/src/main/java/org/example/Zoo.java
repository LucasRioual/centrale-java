package org.example;

public class Zoo {
    public static void main(String[] args) {
        // Création d'instances d'animaux
        Animal lion = new Lion();
        Animal ours = new Ours();

        // Création du visiteur
        AnimalVisitor animalVisitor = new AnimalOperationVisitor();

        // Application du visiteur sur chaque animal
        lion.accept(animalVisitor);
        ours.accept(animalVisitor);

    }
}
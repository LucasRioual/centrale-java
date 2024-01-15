package org.centrale.cli;

import org.centrale.domain.Hand;
import org.centrale.domain.HandFactory;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Joueur 1, choisissez pierre, feuille ou ciseau : ");
        String choixJoueur1 = scanner.nextLine().toLowerCase();
        System.out.println(choixJoueur1);
        Hand hand1 = HandFactory.from(choixJoueur1);
        System.out.println("Joueur 2, choisissez pierre, feuille ou ciseau : ");
        String choixJoueur2 = scanner.nextLine().toLowerCase();
        System.out.println(choixJoueur2);
        Hand hand2 = HandFactory.from(choixJoueur2);

        int result = hand1.playWith(hand2);
        System.out.println(result);







    }

}

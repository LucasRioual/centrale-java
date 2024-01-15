package org.centrale.domain;

public class HandFactory {

    public static Hand from(String hand){
        return switch (hand) {
            case "pierre" -> new Pierre();
            case "feuille" -> new Feuille();
            default -> new Ciseaux();
        };
    }

}

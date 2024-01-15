package org.centrale.api.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String nom;
    private String hand;
    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

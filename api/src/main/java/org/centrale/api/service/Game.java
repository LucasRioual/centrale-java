package org.centrale.api.service;

import org.centrale.domain.Hand;
import org.centrale.domain.HandFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Game {


    public String play(List<Player> listPlayer){
        Hand hand1 = HandFactory.from(listPlayer.get(1).getHand());
        Hand hand2 = HandFactory.from(listPlayer.get(0).getHand());

        int result = hand2.playWith(hand1);
        switch (result) {
            case -1 : return listPlayer.get(0).getNom() + " gagne la partie";
            case 1 : return listPlayer.get(1).getNom() + " gagne la partie";
            default: return "Egalité";
        }

    }

}

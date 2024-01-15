package org.centrale.api.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Players {

    private List<Player> listPlayer;


    public Players(){
        listPlayer = new ArrayList<>();
    }
    public List<Player> getMyList() {
        return listPlayer;
    }

    public void add(Player player){
        listPlayer.add(player);
    }

    public void remove(String nom) {
        for (int i = 0; i < listPlayer.size(); i++) {
            if (listPlayer.get(i).getNom().equals(nom)) {
                listPlayer.remove(i);
                i--;
            }
        }
    }
}

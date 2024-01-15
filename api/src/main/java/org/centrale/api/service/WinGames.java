package org.centrale.api.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class WinGames {

    private List<Player> listWinGame;
    public WinGames(){
        listWinGame = new ArrayList<>();
    }
    public List<Player> getMyList() {

        return listWinGame;
    }
    public void add(Player player){

        listWinGame.add(player);
    }


}


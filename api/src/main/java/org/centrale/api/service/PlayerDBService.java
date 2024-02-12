package org.centrale.api.service;

import org.centrale.api.entity.PlayerEntity;
import org.centrale.api.repository.PlayerRepository;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class PlayerDBService {

    final DataSource dataSource;
    final PlayerRepository playerRepository;

    public PlayerDBService(DataSource dataSource, PlayerRepository playerRepository) {
        this.dataSource = dataSource;
        this.playerRepository = playerRepository;
    }

    // Use of JPA (hibernate).
    public PlayerEntity getPlayerEntity(Long id){
        return playerRepository.findById(id).orElseThrow();
    }


    public void addNewPlayer(String name){
        PlayerEntity newPlayer = new PlayerEntity();
        newPlayer.setName(name);
        playerRepository.save(newPlayer);
    }
}

package org.centrale.api.controller;

import org.centrale.api.entity.PlayerEntity;
import org.centrale.api.repository.GameRepository;
import org.centrale.api.repository.PlayerRepository;
import org.centrale.api.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/player")
public class PlayerController {


    final PlayerDBService playerDBService;

    public PlayerController(PlayerDBService playerDBService){

        this.playerDBService = playerDBService;


    }

    @PostMapping("")
    public void addPlayer(@RequestParam String name){
        playerDBService.addNewPlayer(name);
    }

    @GetMapping("/{id}")
    public PlayerEntity getPlayer(@PathVariable Long id){return playerDBService.getPlayerEntity(id);}





}

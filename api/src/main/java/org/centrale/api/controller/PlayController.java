package org.centrale.api.controller;

import org.centrale.api.entity.PlayerEntity;
import org.centrale.api.repository.GameRepository;
import org.centrale.api.repository.PlayerRepository;
import org.centrale.api.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/play")
public class PlayController {


    final GameService gameService;

    public PlayController(GameService gameService){
        this.gameService = gameService;

    }

    @PostMapping
    public void play(@RequestParam Long player1Id, @RequestParam Long player2Id, @RequestParam String handPlayer1, @RequestParam String handPlayer2){
        gameService.play(player1Id, player2Id, handPlayer1, handPlayer2);
    }




}

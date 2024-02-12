package org.centrale.api.controller;

import org.centrale.api.entity.PlayerEntity;
import org.centrale.api.repository.GameRepository;
import org.centrale.api.repository.PlayerRepository;
import org.centrale.api.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/game-stats")
public class StatController {


    final GameService gameService;

    public StatController(GameService gameService){
        this.gameService = gameService;

    }

    @GetMapping
    public String play(@RequestParam Long playerId1){
        return gameService.getStats(playerId1);
    }




}

package org.centrale.api.controller;

import org.centrale.api.service.*;
import org.springframework.web.bind.annotation.*;
import org.centrale.domain.Hand;
import org.centrale.domain.HandFactory;

import java.util.List;


@RestController
public class ExampleController {

    final Players players;
    final PlayerDBService playerDBService;
    final GameRepository gameRepository;

    public ExampleController(Players players, PlayerDBService playerDBService, GameRepository gameRepository){

        this.players = players;
        this.playerDBService = playerDBService;
        this.gameRepository = gameRepository;

    }
    @PostMapping("/addDb")
    public void addPlayerDb(@RequestParam String nom, Integer id){
        playerDBService.addPlayer(id,nom);
    }

    @PostMapping("/addGame")
    public void addPGame(@RequestParam String description, Integer id){
        GameEntity gameEntity =new GameEntity();
        gameEntity.setId(id);
        gameEntity.setDescription(description);
        gameRepository.save(gameEntity);
    }
    @PostMapping("/add")
    public void addPlayer(@RequestParam String nom, String hand){
        Player player = new Player();
        player.setNom(nom);
        player.setHand(hand);
        players.add(player);
    }
    @DeleteMapping("/remove")
    public void removePlayer(@RequestParam String nom ){
        players.remove(nom);
    }
    @GetMapping("player")
    public List<Player> seeList(){
        return players.getMyList();
    }
    @GetMapping("game")
    public String play(){
        Game game = new Game();
        return game.play(players.getMyList());
    }

    @GetMapping("winGame")
    public String getHistory(@RequestParam String nom){
        return null;
    }

}

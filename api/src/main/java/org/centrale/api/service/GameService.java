package org.centrale.api.service;


import org.centrale.api.entity.GameEntity;
import org.centrale.api.entity.PlayerEntity;
import org.centrale.api.repository.GameRepository;
import org.centrale.api.repository.PlayerRepository;
import org.centrale.domain.Hand;
import org.centrale.domain.HandFactory;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

@Service
public class GameService {

    final GameRepository gameRepository;
    final PlayerDBService playerDBService;

    public GameService(GameRepository gameRepository, PlayerDBService playerDBService) {
        this.gameRepository = gameRepository;
        this.playerDBService = playerDBService;
    }

    public String getStats(Long playerId) {
        Long gamesWon = gameRepository.countGamesWonByPlayer(playerId);
        Long gamesLost = gameRepository.countGamesLostByPlayer(playerId);
        List<Object[]> opponentWithMostWins = gameRepository.findOpponentWithMostWins(playerId);
        System.out.println(Arrays.toString(opponentWithMostWins.getFirst()));
        String opponentName = playerDBService.getPlayerEntity((long)opponentWithMostWins.getFirst()[0]).getName();


        return "Nombre de parties gagnées: " + gamesWon +
                "\nNombre de défaites: " + gamesLost +
                "\nPire joueur ennemi:  " + opponentName;
    }

    public void play(Long playerId1, Long playerId2, String Hand1, String Hand2) {

        PlayerEntity player1 = playerDBService.getPlayerEntity(playerId1);
        PlayerEntity player2 = playerDBService.getPlayerEntity(playerId2);

        Hand hand1 = HandFactory.from(Hand1);
        Hand hand2 = HandFactory.from(Hand2);

        int result = hand2.playWith(hand1);
        PlayerEntity winner = switch (result) {
            case -1 -> player2;
            case 1 -> player1;
            default -> null;
        };

        GameEntity game = new GameEntity();
        game.setPlayer1(player1);
        game.setPlayer2(player2);
        game.setWinner(winner);

        gameRepository.save(game);


    }

}


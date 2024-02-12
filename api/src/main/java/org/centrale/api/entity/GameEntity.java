package org.centrale.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "game")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PlayerEntity player1;

    @ManyToOne
    private PlayerEntity player2;

    @ManyToOne
    private PlayerEntity winner;

    public void setPlayer1(PlayerEntity player) {
        this.player1 = player;
    }

    public void setPlayer2(PlayerEntity player) {
        this.player2 = player;
    }

    public void setWinner(PlayerEntity player) {
        this.winner = player;
    }



}

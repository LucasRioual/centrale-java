package org.centrale.api.repository;

import org.centrale.api.entity.GameEntity;
import org.centrale.api.entity.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends CrudRepository<GameEntity,Integer> {
    List<GameEntity> findByWinnerId(Long winnerId);

    @Query("SELECT COUNT(g) FROM GameEntity g WHERE g.winner.id = :playerId")
    Long countGamesWonByPlayer(@Param("playerId") Long playerId);

    @Query("SELECT COUNT(g) FROM GameEntity g WHERE (g.player1.id = :playerId OR g.player2.id = :playerId) AND g.winner.id <> :playerId")
    Long countGamesLostByPlayer(@Param("playerId") Long playerId);

    @Query("SELECT g.winner.id, COUNT(g.winner.id) AS count FROM GameEntity g WHERE g.winner.id != :winnerIdParam GROUP BY g.winner.id ORDER BY count DESC")
    List<Object[]> findOpponentWithMostWins(@Param("winnerIdParam") Long winnerIdParam);
}

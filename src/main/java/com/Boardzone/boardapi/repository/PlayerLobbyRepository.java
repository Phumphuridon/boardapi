package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.PlayerLobbyEntity;
import com.Boardzone.boardapi.entity.PlayerLobbyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerLobbyRepository extends JpaRepository<PlayerLobbyEntity, PlayerLobbyId> {

    // Method to find all player-lobby associations by lobby ID
    List<PlayerLobbyEntity> findByLobby_Lobby_id(int lobbyId);

    // Method to check if a specific player-lobby association exists
    boolean existsByPlayer_idAndLobby_id(int playerId, int lobbyId);
}

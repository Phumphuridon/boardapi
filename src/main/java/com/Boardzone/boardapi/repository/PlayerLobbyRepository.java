package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.PlayerLobby;
import com.Boardzone.boardapi.entity.PlayerLobbyId; // Assuming you have a composite key for PlayerLobby
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerLobbyRepository extends JpaRepository<PlayerLobby, PlayerLobbyId> {
    // Method to find all players in a specific lobby
    List<PlayerLobby> findByLobbyId(int lobbyId);
    
    // Method to check if a player is in a specific lobby
    boolean existsByPlayerIdAndLobbyId(int playerId, int lobbyId);
}

package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.PlayerLobbyEntity;

import java.util.List;

public interface PlayerLobbyService {
    // Retrieve all players in a specific lobby
    List<PlayerLobbyEntity> getPlayersInLobby(int lobbyId);
    
    // Method for a player to join a lobby
    PlayerLobbyEntity joinLobby(int playerId, int lobbyId);
    
    // Method for a player to leave a lobby
    void leaveLobby(int playerId, int lobbyId);
    
    // Check if a player is in a specific lobby
    boolean isPlayerInLobby(int playerId, int lobbyId);
}

package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.PlayerLobbyEntity;
import com.Boardzone.boardapi.entity.PlayerLobbyId;
import com.Boardzone.boardapi.repository.PlayerLobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional; // Using Jakarta
import java.util.List;

@Service
public class PlayerLobbyServiceImplement implements PlayerLobbyService {

    @Autowired
    private PlayerLobbyRepository playerLobbyRepository;

    @Override
    @Transactional
    public List<PlayerLobbyEntity> getPlayersInLobby(int lobbyId) {
        return playerLobbyRepository.findByLobby_Lobby_id(lobbyId);
    }

    @Override
    @Transactional
    public PlayerLobbyEntity joinLobby(int playerId, int lobbyId) {
        // Check if the player is already in the lobby
        if (!isPlayerInLobby(playerId, lobbyId)) {
            PlayerLobbyEntity playerLobbyEntity = new PlayerLobbyEntity();
            playerLobbyEntity.setPlayer_id(playerId);
            playerLobbyEntity.setLobby_id(lobbyId);
            return playerLobbyRepository.save(playerLobbyEntity);
        }
        return null; // or throw an exception if you prefer
    }

    @Override
    @Transactional
    public void leaveLobby(int playerId, int lobbyId) {
        PlayerLobbyId playerLobbyId = new PlayerLobbyId(playerId, lobbyId);
        if (isPlayerInLobby(playerId, lobbyId)) {
            playerLobbyRepository.deleteById(playerLobbyId);
        }
        // Consider adding handling for cases where the player is not in the lobby
    }

    @Override
    @Transactional
    public boolean isPlayerInLobby(int playerId, int lobbyId) {
        return playerLobbyRepository.existsByPlayer_idAndLobby_id(playerId, lobbyId);
    }
}

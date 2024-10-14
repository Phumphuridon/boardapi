package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.PlayerLobbyEntity;
import com.Boardzone.boardapi.entity.PlayerLobbyId;
import com.Boardzone.boardapi.repository.PlayerLobbyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerLobbyServiceImplement implements PlayerLobbyService {

    private final PlayerLobbyRepository playerLobbyRepository;

    @Autowired
    public PlayerLobbyServiceImplement(PlayerLobbyRepository playerLobbyRepository) {
        this.playerLobbyRepository = playerLobbyRepository;
    }

    @Override
    @Transactional
    public List<PlayerLobbyEntity> getPlayersInLobby(int lobbyId) {
        return playerLobbyRepository.findByLobby_LobbyId(lobbyId);
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
        return null; // or handle appropriately
    }

    @Override
    @Transactional
    public void leaveLobby(int playerId, int lobbyId) {
        PlayerLobbyId playerLobbyId = new PlayerLobbyId(playerId, lobbyId);
        if (isPlayerInLobby(playerId, lobbyId)) {
            playerLobbyRepository.deleteById(playerLobbyId);
        }
    }

    @Override
    @Transactional
    public boolean isPlayerInLobby(int playerId, int lobbyId) {
        return playerLobbyRepository.existsByPlayerIdAndLobbyId(playerId, lobbyId);
    }
}

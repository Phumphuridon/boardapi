package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.PlayerLobbyEntity;
import com.Boardzone.boardapi.entity.PlayerLobbyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerLobbyRepository extends JpaRepository<PlayerLobbyEntity, PlayerLobbyId> {

    boolean existsByPlayer_idAndLobby_id(int playerId, int lobbyId);

    //List<PlayerLobbyEntity> findByLobby_lobbyId(int lobbyId); // Ensure fields match exactly

    public List<PlayerLobbyEntity> findByLobby_Lobby_id(int lobbyId);
}


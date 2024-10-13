package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.LobbyEntity;

import java.util.List;

public interface LobbyService {
    List<LobbyEntity> getAllLobby();
    LobbyEntity getLobbyById(int id);
    LobbyEntity addLobby(LobbyEntity lobby);
    LobbyEntity updateLobby(int id, LobbyEntity lobbyDetails);
    void deleteLobbyById(int id);
}

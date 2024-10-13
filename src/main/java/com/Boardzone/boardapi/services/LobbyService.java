package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.Lobby;
import java.util.List;

public interface LobbyService {
    List<Lobby> getAllLobby();
    
    Lobby getLobbyById(Integer id);
    
    Lobby addLobby(Lobby lobby);
    
    void deleteLobbyById(Integer id);
}

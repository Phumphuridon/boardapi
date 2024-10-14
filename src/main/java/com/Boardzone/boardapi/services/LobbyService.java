/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.Lobby;
import com.Boardzone.boardapi.entity.User;
import java.util.List;

/**
 *
 * @author phump
 */
public interface LobbyService {
    List<Lobby> getAllLobby();
    
    Lobby getLobbyById(Integer id);
    
    Lobby addLobby(Lobby lobby);
    
    void deleteLobbyById(Integer id);
    
    List<User> getAllUsersInLobby(Integer lobby_id);
}

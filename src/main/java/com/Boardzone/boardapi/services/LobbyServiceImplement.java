/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.Lobby;
import com.Boardzone.boardapi.repository.LobbyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phump
 */
@Service
public class LobbyServiceImplement implements LobbyService{
    private LobbyRepository lobbyRepository;
    
    @Autowired
    public LobbyServiceImplement(LobbyRepository lobbyRepository) {
        this.lobbyRepository = lobbyRepository;
    }

    @Override
    public List<Lobby> getAllLobby() {
        return lobbyRepository.findAll();
    }

    @Override
    public Lobby getLobbyById(Integer id) {
        return lobbyRepository.findById(id).orElse(null);
    }

    @Override
    public Lobby addLobby(Lobby lobby) {
        lobby.setLobby_id(0);
        return lobbyRepository.save(lobby);
    }

    @Override
    public void deleteLobbyById(Integer id) {
        lobbyRepository.deleteById(id);
    }
}

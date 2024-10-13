package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.LobbyEntity;
import com.Boardzone.boardapi.repository.LobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LobbyServiceImplement implements LobbyService {

    @Autowired
    private LobbyRepository lobbyRepository;

    public List<LobbyEntity> getAllLobbies() {
        return lobbyRepository.findAll();
    }

    @Override
    public LobbyEntity getLobbyById(int id) {
        Optional<LobbyEntity> lobby = lobbyRepository.findById(id);
        return lobby.orElse(null);
    }

    @Override
    public LobbyEntity addLobby(LobbyEntity lobby) {
        return lobbyRepository.save(lobby);
    }

    @Override
    public LobbyEntity updateLobby(int id, LobbyEntity lobbyDetails) {
        LobbyEntity lobby = getLobbyById(id);
        if (lobby != null) {
            lobby.setLobby_description(lobbyDetails.getLobby_description());
            lobby.setLobby_created_at(lobbyDetails.getLobby_created_at());
            lobby.setLobby_ended_at(lobbyDetails.getLobby_ended_at());
            // Update other fields as necessary
            return lobbyRepository.save(lobby);
        }
        return null;
    }

    @Override
    public void deleteLobbyById(int id) {
        lobbyRepository.deleteById(id);
    }

    @Override
    public List<LobbyEntity> getAllLobby() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

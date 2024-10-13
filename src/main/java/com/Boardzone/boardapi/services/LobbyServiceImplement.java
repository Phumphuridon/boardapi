package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.Lobby;
import com.Boardzone.boardapi.repository.LobbyRepository;
import jakarta.transaction.Transactional; // Ensure you are using the jakarta package
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LobbyServiceImplement implements LobbyService {

    @Autowired
    private LobbyRepository lobbyRepository;

    @Override
    @Transactional
    public List<Lobby> getAllLobby() {
        return lobbyRepository.findAll(); // Fetch all lobbies from the repository
    }

    @Override
    @Transactional
    public Lobby getLobbyById(Integer id) {
        Optional<Lobby> lobbyOptional = lobbyRepository.findById(id);
        return lobbyOptional.orElse(null); // Return null if not found
    }

    @Override
    @Transactional
    public Lobby addLobby(Lobby lobby) {
        return lobbyRepository.save(lobby); // Save and return the new lobby
    }

    @Override
    @Transactional
    public void deleteLobbyById(Integer id) {
        lobbyRepository.deleteById(id); // Delete the lobby by ID
    }
}

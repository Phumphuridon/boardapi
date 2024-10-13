package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.LobbyEntity;
import com.Boardzone.boardapi.services.LobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lobbies")
public class LobbyController {

    @Autowired
    private LobbyService lobbyService;

    @GetMapping
    public List<LobbyEntity> getAllLobbies() {
        return lobbyService.getAllLobby();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LobbyEntity> getLobbyById(@PathVariable int id) {
        LobbyEntity lobby = lobbyService.getLobbyById(id);
        return lobby != null ? ResponseEntity.ok(lobby) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<LobbyEntity> addLobby(@RequestBody LobbyEntity lobby) {
        LobbyEntity newLobby = lobbyService.addLobby(lobby);
        return ResponseEntity.ok(newLobby);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LobbyEntity> updateLobby(@PathVariable int id, @RequestBody LobbyEntity lobbyDetails) {
        LobbyEntity updatedLobby = lobbyService.updateLobby(id, lobbyDetails);
        return updatedLobby != null ? ResponseEntity.ok(updatedLobby) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLobbyById(@PathVariable int id) {
        lobbyService.deleteLobbyById(id);
        return ResponseEntity.noContent().build();
    }
}

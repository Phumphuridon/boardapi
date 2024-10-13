package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.PlayerLobbyEntity;
import com.Boardzone.boardapi.services.PlayerLobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/playerlobbies")
public class PlayerLobbyController {

    @Autowired
    private PlayerLobbyService playerLobbyService;

    @GetMapping("/lobby/{lobbyId}")
    public List<PlayerLobbyEntity> getPlayersInLobby(@PathVariable int lobbyId) {
        return playerLobbyService.getPlayersInLobby(lobbyId);
    }

    @PostMapping("/join")
    public ResponseEntity<PlayerLobbyEntity> joinLobby(
            @RequestParam int playerId,
            @RequestParam int lobbyId) {
        PlayerLobbyEntity playerLobby = playerLobbyService.joinLobby(playerId, lobbyId);
        return ResponseEntity.ok(playerLobby);
    }

    @DeleteMapping("/leave")
    public ResponseEntity<Void> leaveLobby(
            @RequestParam int playerId,
            @RequestParam int lobbyId) {
        playerLobbyService.leaveLobby(playerId, lobbyId);
        return ResponseEntity.noContent().build();
    }
}

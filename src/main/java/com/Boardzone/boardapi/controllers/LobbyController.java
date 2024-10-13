/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.Lobby;
import com.Boardzone.boardapi.services.LobbyService;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author phump
 */
@RestController    

@RequestMapping("/api/lobbies")
public class LobbyController {
    private LobbyService lobbyService;
    
    @Autowired
    public LobbyController(LobbyService lobbyService) {
        this.lobbyService = lobbyService;
    }
    
    @GetMapping("/viewall")
    public List<Lobby> getAllLobby(){
        return lobbyService.getAllLobby();
    }
    
    @GetMapping("/{id}")
    public Lobby getLobby(@PathVariable Integer id){
        return lobbyService.getLobbyById(id);
    }
    
    @PostMapping("/create")
    public Lobby createLobby(@RequestBody Lobby lobby){
        lobby.setLobby_id(0);
        return lobbyService.addLobby(lobby);
    }
    
    @DeleteMapping("/delete")
    public void deleteLobby(Integer id){
        lobbyService.deleteLobbyById(id);
    }
}

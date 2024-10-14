/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.Lobby;
import com.Boardzone.boardapi.entity.User;
import com.Boardzone.boardapi.repository.UserRepository;
import com.Boardzone.boardapi.services.LobbyService;
import com.Boardzone.boardapi.services.UserService;
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
    private UserService userService;
    
    @Autowired
    public LobbyController(LobbyService lobbyService, UserService userService) {
        this.lobbyService = lobbyService;
        this.userService = userService;
    }
    
    @GetMapping("/viewall")
    public List<Lobby> getAllLobby(){
        return lobbyService.getAllLobby();
    }
    
    @GetMapping("/alljoined")
    public List<User> getAllUsersInLobby(@RequestParam Integer lobby_id){
        return lobbyService.getAllUsersInLobby(3);
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
    
    @PostMapping("/join")
    public User joinLobby(@RequestParam Integer user_id, Integer lobby_id){
        User joiningUser = userService.getUserById(user_id);
        Lobby joinedLobby = lobbyService.getLobbyById(lobby_id);
        joiningUser.setLobby_id(joinedLobby);
        userService.updateUser(joiningUser);
        return joiningUser;
    }
    
    @PostMapping("/leave")
    public User leaveLobby(@RequestParam Integer user_id){
        User joinedUser = userService.getUserById(user_id);
        joinedUser.setLobby_id(null);
        return joinedUser;
    }
    
}

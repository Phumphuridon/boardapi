/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.Lobby;
import com.Boardzone.boardapi.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author phump
 */
public interface LobbyRepository extends JpaRepository<Lobby, Integer>{
    @Query("SELECT u FROM User u WHERE u.lobby_id.lobby_id = :lobby_id")
    List<User> getAllUsersInLobby(Integer lobby_id);
}

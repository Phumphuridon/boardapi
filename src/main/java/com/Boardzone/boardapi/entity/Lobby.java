/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 *
 * @author phump
 */
@Entity
@Table
public class Lobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lobby_id;
    
    private String lobby_location;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date lobby_created_at;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date lobby_ended_at;

    public Lobby() {
    }

    public Lobby(String lobby_location, Date lobby_created_at, Date lobby_ended_at) {
        this.lobby_location = lobby_location;
        this.lobby_created_at = lobby_created_at;
        this.lobby_ended_at = lobby_ended_at;
    }

    public int getLobby_id() {
        return lobby_id;
    }

    public void setLobby_id(int lobby_id) {
        this.lobby_id = lobby_id;
    }

    public String getLobby_location() {
        return lobby_location;
    }

    public void setLobby_location(String lobby_location) {
        this.lobby_location = lobby_location;
    }

    public Date getLobby_created_at() {
        return lobby_created_at;
    }

    public void setLobby_created_at(Date lobby_created_at) {
        this.lobby_created_at = lobby_created_at;
    }

    public Date getLobby_ended_at() {
        return lobby_ended_at;
    }

    public void setLobby_ended_at(Date lobby_ended_at) {
        this.lobby_ended_at = lobby_ended_at;
    }
}

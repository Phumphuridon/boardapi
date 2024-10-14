/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER",
       uniqueConstraints = @UniqueConstraint(columnNames = "user_name", name = "user_name_unique")
)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "user_name", columnDefinition = "VARCHAR(30)", nullable = false, unique = true)
    private String user_name;

    @Column(name = "user_password", columnDefinition = "CHAR(64)", nullable = false)
    private String user_password;

    @Lob
    @Column(name = "user_profile", columnDefinition = "MEDIUMBLOB")
    private byte[] user_profile;
    
    @ManyToOne
    @JoinColumn(name = "Lobby")
    private Lobby lobby;
    
    public User() {
    }

    public User(String user_name, String user_password) {
        this.user_name = user_name;
        this.user_password = user_password;
    }

    public User(String user_name, String user_password, byte[] user_profile) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_profile = user_profile;
    }

    public User(String user_name, String user_password, byte[] user_profile, Lobby lobby) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_profile = user_profile;
        this.lobby = lobby;
    }
    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public byte[] getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(byte[] user_profile) {
        this.user_profile = user_profile;
    }

    public Lobby getLobby_id() {
        return lobby;
    }

    public void setLobby_id(Lobby lobby_id) {
        this.lobby = lobby_id;
    }
}

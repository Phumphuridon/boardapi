package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "playerlobby")
@IdClass(PlayerLobbyId.class)  // Composite Key Class
public class PlayerLobbyEntity {
    @Id
    @Column(name = "player_id")
    private int player_id;

    @Id
    @Column(name = "lobby_id")
    private int lobby_id;

    // Foreign key reference to User
    @ManyToOne
    @JoinColumn(name = "player_id", insertable = false, updatable = false)
    private User user;

    // Foreign key reference to Lobby
    @ManyToOne
    @JoinColumn(name = "lobby_id", insertable = false, updatable = false)
    private LobbyEntity lobby;

    // Getters and Setters
    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getLobby_id() {
        return lobby_id;
    }

    public void setLobby_id(int lobby_id) {
        this.lobby_id = lobby_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LobbyEntity getLobby() {
        return lobby;
    }

    public void setLobby(LobbyEntity lobby) {
        this.lobby = lobby;
    }
}

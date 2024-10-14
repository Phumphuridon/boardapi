package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "playerlobby")
@IdClass(PlayerLobbyId.class)  // Composite Key Class
public class PlayerLobbyEntity {
    @Id
    @Column(name = "player_id")
    private int playerId;

    @Id
    @Column(name = "lobby_id")
    private int lobbyId;

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
        return playerId;
    }

    public void setPlayer_id(int player_id) {
        this.playerId = playerId;
    }

    public int getLobby_id() {
        return lobbyId;
    }

    public void setLobby_id(int lobby_id) {
        this.lobbyId = lobbyId;
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

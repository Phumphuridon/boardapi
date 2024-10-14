package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "lobby")
public class LobbyEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lobby_id", unique = true, nullable = false)
    private int lobbyId;

    @Column(name = "lobby_description", length = 255)
    private String lobby_description;

    @Column(name = "lobby_created_at", nullable = false)
    private LocalDateTime lobby_created_at;

    @Column(name = "lobby_ended_at", nullable = false)
    private LocalDateTime lobby_ended_at;

    @OneToMany(mappedBy = "lobby", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PlayerLobbyEntity> playersInLobby;

    @OneToOne
    @JoinColumn(name = "boardgame_id", referencedColumnName = "boardgame_id")
    private BoardGameEntity boardGame;
    @ManyToOne
    @JoinColumn(name = "lobby_id", insertable = false, updatable = false)
    private LobbyEntity lobby;
    @ManyToOne
    @JoinColumn(name = "player_id", insertable = false, updatable = false)
    private User user;
    // Getters and Setters
    public int getLobby_id() {
        return lobbyId;
    }

    public void setLobby_id(int lobbyId) {
        this.lobbyId = lobbyId;
    }

    public String getLobby_description() {
        return lobby_description;
    }

    public void setLobby_description(String lobby_description) {
        this.lobby_description = lobby_description;
    }

    public LocalDateTime getLobby_created_at() {
        return lobby_created_at;
    }

    public void setLobby_created_at(LocalDateTime lobby_created_at) {
        this.lobby_created_at = lobby_created_at;
    }

    public LocalDateTime getLobby_ended_at() {
        return lobby_ended_at;
    }

    public void setLobby_ended_at(LocalDateTime lobby_ended_at) {
        this.lobby_ended_at = lobby_ended_at;
    }

    public Set<PlayerLobbyEntity> getPlayersInLobby() {
        return playersInLobby;
    }

    public void setPlayersInLobby(Set<PlayerLobbyEntity> playersInLobby) {
        this.playersInLobby = playersInLobby;
    }

    public BoardGameEntity getBoardGame() {
        return boardGame;
    }

    public void setBoardGame(BoardGameEntity boardGame) {
        this.boardGame = boardGame;
    }
}

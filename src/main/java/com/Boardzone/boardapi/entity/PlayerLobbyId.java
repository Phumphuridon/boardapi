package com.Boardzone.boardapi.entity;

import java.io.Serializable;
import java.util.Objects;

public class PlayerLobbyId implements Serializable {
    private int playerId;
    private int lobbyId;

    // Default constructor
    public PlayerLobbyId() {}

    public PlayerLobbyId(int playerId, int lobbyId) {
        this.playerId = playerId;
        this.lobbyId = lobbyId;
    }

    // Getters and Setters
    public int getPlayer_id() {
        return playerId;
    }

    public void setPlayer_id(int playerId) {
        this.playerId = playerId;
    }

    public int getLobby_id() {
        return lobbyId;
    }

    public void setLobby_id(int lobbyId) {
        this.lobbyId = lobbyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerLobbyId)) return false;
        PlayerLobbyId that = (PlayerLobbyId) o;
        return playerId == that.playerId && lobbyId == that.lobbyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, lobbyId);
    }
}

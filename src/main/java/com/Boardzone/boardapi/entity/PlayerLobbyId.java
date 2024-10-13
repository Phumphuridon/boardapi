package com.Boardzone.boardapi.entity;

import java.io.Serializable;
import java.util.Objects;

public class PlayerLobbyId implements Serializable {
    private int player_id;
    private int lobby_id;

    // Default constructor
    public PlayerLobbyId() {}

    public PlayerLobbyId(int player_id, int lobby_id) {
        this.player_id = player_id;
        this.lobby_id = lobby_id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerLobbyId)) return false;
        PlayerLobbyId that = (PlayerLobbyId) o;
        return player_id == that.player_id && lobby_id == that.lobby_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(player_id, lobby_id);
    }
}

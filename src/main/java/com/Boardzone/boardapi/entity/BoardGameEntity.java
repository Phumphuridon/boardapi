package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="BoardGame")
public class BoardGameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardgame_id;
    private String boardgame_name;
    private int boardgame_max_player;
    private long lobby_id;
    private byte[] imageset_id;
    private String boardgame_description;

    public long getBoardgame_id() {
        return boardgame_id;
    }

    public void setBoardgame_id(long boardgame_id) {
        this.boardgame_id = boardgame_id;
    }

    public String getBoardgame_name() {
        return boardgame_name;
    }

    public void setBoardgame_name(String boardgame_name) {
        this.boardgame_name = boardgame_name;
    }

    public int getBoardgame_max_player() {
        return boardgame_max_player;
    }

    public void setBoardgame_max_player(int boardgame_max_player) {
        this.boardgame_max_player = boardgame_max_player;
    }

    public long getLobby_id() {
        return lobby_id;
    }

    public void setLobby_id(long lobby_id) {
        this.lobby_id = lobby_id;
    }

    public byte[] getImageset_id() {
        return imageset_id;
    }

    public void setImageset_id(byte[] imageset_id) {
        this.imageset_id = imageset_id;
    }

    public String getBoardgame_description() {
        return boardgame_description;
    }

    public void setBoardgame_description(String boardgame_description) {
        this.boardgame_description = boardgame_description;
    }
}

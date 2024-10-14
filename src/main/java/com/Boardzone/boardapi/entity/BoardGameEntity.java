package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="boardgame")
public class BoardGameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardgame_id;
    
    private String boardgame_name;
    private int boardgame_max_player;
    private long lobby_id;
    
    @Lob
    @Column(columnDefinition = "mediumblob")
    private byte[] boardgame_image;
    private String boardgame_description;

    public BoardGameEntity() {
    }

    public BoardGameEntity(String boardgame_name, int boardgame_max_player, byte[] boardgame_image, String boardgame_description) {
        this.boardgame_name = boardgame_name;
        this.boardgame_max_player = boardgame_max_player;
        this.boardgame_image = boardgame_image;
        this.boardgame_description = boardgame_description;
    }
    
    public BoardGameEntity(String boardgame_name, int boardgame_max_player, long lobby_id, byte[] boardgame_image, String boardgame_description) {
        this.boardgame_name = boardgame_name;
        this.boardgame_max_player = boardgame_max_player;
        this.lobby_id = lobby_id;
        this.boardgame_image = boardgame_image;
        this.boardgame_description = boardgame_description;
    }

    public int getBoardgame_id() {
        return boardgame_id;
    }

    public void setBoardgame_id(int boardgame_id) {
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

    public byte[] getBoardgame_image() {
        return boardgame_image;
    }

    public void setBoardgame_image(byte[] boardgame_image) {
        this.boardgame_image = boardgame_image;
    }

    public String getBoardgame_description() {
        return boardgame_description;
    }

    public void setBoardgame_description(String boardgame_description) {
        this.boardgame_description = boardgame_description;
    }
}

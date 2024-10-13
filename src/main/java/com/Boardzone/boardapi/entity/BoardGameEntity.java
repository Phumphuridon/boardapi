package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "BOARDGAME")
public class BoardGameEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardgame_id;

    private String boardgame_name;
    private int boardgame_max_player;
    private long lobby_id;
    
    @Lob
    private byte[] imageset_id;

    @Lob
    private String boardgame_description;

    private Date boardgame_dateAdded;

    @Lob
    private String boardgame_rules;

    private String boardgame_category;

    // Default constructor
    public BoardGameEntity() {}

    // Constructor with fields
    public BoardGameEntity(String boardgame_name, int boardgame_max_player, long lobby_id, byte[] imageset_id,
                           String boardgame_description, Date boardgame_dateAdded, String boardgame_rules, String boardgame_category) {
        this.boardgame_name = boardgame_name;
        this.boardgame_max_player = boardgame_max_player;
        this.lobby_id = lobby_id;
        this.imageset_id = imageset_id;
        this.boardgame_description = boardgame_description;
        this.boardgame_dateAdded = boardgame_dateAdded;
        this.boardgame_rules = boardgame_rules;
        this.boardgame_category = boardgame_category;
    }

    // Getters and Setters
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

    public Date getBoardgame_dateAdded() {
        return boardgame_dateAdded;
    }

    public void setBoardgame_dateAdded(Date boardgame_dateAdded) {
        this.boardgame_dateAdded = boardgame_dateAdded;
    }

    public String getBoardgame_rules() {
        return boardgame_rules;
    }

    public void setBoardgame_rules(String boardgame_rules) {
        this.boardgame_rules = boardgame_rules;
    }

    public String getBoardgame_category() {
        return boardgame_category;
    }

    public void setBoardgame_category(String boardgame_category) {
        this.boardgame_category = boardgame_category;
    }
}

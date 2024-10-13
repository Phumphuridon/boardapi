package com.Boardzone.boardapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "boardgame")
public class BoardGameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardgame_id;

    @Column(name = "boardgame_name", nullable = false, length = 50)
    private String boardgame_name;

    @Column(name = "boardgame_description", length = 3500)
    private String boardgame_description;

    @Column(name = "boardgame_max_player", nullable = false)
    private int boardgame_max_player;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "imageset_id", referencedColumnName = "imageset_id")
    private ImageSetEntity imageSet;

    // Getters and Setters
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

    public String getBoardgame_description() {
        return boardgame_description;
    }

    public void setBoardgame_description(String boardgame_description) {
        this.boardgame_description = boardgame_description;
    }

    public int getBoardgame_max_player() {
        return boardgame_max_player;
    }

    public void setBoardgame_max_player(int boardgame_max_player) {
        this.boardgame_max_player = boardgame_max_player;
    }

    public ImageSetEntity getImageSet() {
        return imageSet;
    }

    public void setImageSet(ImageSetEntity imageSet) {
        this.imageSet = imageSet;
    }
}

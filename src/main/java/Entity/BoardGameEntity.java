/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
/**
 *
 * @author User
 */
@Entity(name="BOARDGAME")
public class BoardGameEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardgame_id;
    private String boardgame_name;
    private int boardgame_max_player;
    private long lobby_id;
    private byte[] imageset_id;
    
    @Lob
    private String boardgame_description;
    private Date boardgame_dateAdded;
    
    @Lob
    private String boardgame_rules;
    private String boardgame_category;
    
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

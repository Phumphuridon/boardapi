/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * @author user
 */
public interface BoardGameService {
    
    BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, long lobbyId, byte[] imagesetId,
                                 String description, Date dateAdded, String rules, String category);
    
    List<BoardGameEntity> getAllBoardGames();
    
    BoardGameEntity getBoardGame(long boardgameId);
    
    void deleteBoardGame(long boardgameId);
    
    BoardGameEntity updateBoardGame(long boardgameId, String boardgameName, int maxPlayers, long lobbyId,
                                    byte[] imagesetId, String description, Date dateAdded, String rules, String category);
}

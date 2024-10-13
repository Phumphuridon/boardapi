package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import java.util.List;

/**
 * Service interface for managing board games.
 * 
 * @author user
 */
public interface BoardGameService {
    
    BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, long lobbyId, byte[] imagesetId,
                                 String description);
    
    List<BoardGameEntity> getAllBoardGames();
    
    BoardGameEntity getBoardGame(long boardgameId);
    
    void deleteBoardGame(long boardgameId);
    
    BoardGameEntity updateBoardGame(long boardgameId, String boardgameName, int maxPlayers, long lobbyId,
                                    byte[] imagesetId, String description);
}

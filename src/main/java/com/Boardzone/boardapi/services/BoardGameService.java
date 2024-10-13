package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import java.util.List;

public interface BoardGameService {
    BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, int lobbyId, byte[] imagesetId, String description);
    List<BoardGameEntity> getAllBoardGames();
    BoardGameEntity getBoardGame(int boardgameId); 
    void deleteBoardGame(int boardgameId); 
    BoardGameEntity updateBoardGame(int boardgameId, String boardgameName, int maxPlayers, int lobbyId, byte[] imagesetId, String description); 
    int findFirstAvailableId(); 
}

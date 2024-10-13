package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import java.util.List;

public interface BoardGameService {
    BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, long lobbyId, int imagesetId, String description);
    List<BoardGameEntity> getAllBoardGames();
    BoardGameEntity getBoardGame(long boardgameId);
    void deleteBoardGame(long boardgameId);
    BoardGameEntity updateBoardGame(long boardgameId, String boardgameName, int maxPlayers, long lobbyId, int imagesetId, String description);
    long findFirstAvailableId();
}

package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import java.util.List;

public interface BoardGameService {
    BoardGameEntity addBoardGame(BoardGameEntity boardgame);
    List<BoardGameEntity> getAllBoardGames();
    BoardGameEntity getBoardGame(long boardgameId);
    void deleteBoardGame(long boardgameId);
    BoardGameEntity updateBoardGame(BoardGameEntity boardgame);
    long findFirstAvailableId();
}

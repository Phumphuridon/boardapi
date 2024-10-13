package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.entity.ImageSetEntity;

import java.util.List;

public interface BoardGameService {
    BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, ImageSetEntity imageSet, String description);
    List<BoardGameEntity> getAllBoardGames();
    BoardGameEntity getBoardGameById(int boardgameId);
    BoardGameEntity updateBoardGame(int boardgameId, String boardgameName, int maxPlayers, ImageSetEntity imageSet, String description);
    void deleteBoardGame(int boardgameId);
}

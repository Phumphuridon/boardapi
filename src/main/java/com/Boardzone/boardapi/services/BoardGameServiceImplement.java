package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.entity.ImageSetEntity;
import com.Boardzone.boardapi.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardGameServiceImplement implements BoardGameService {

    @Autowired
    private BoardGameRepository boardGameRepository;

    public BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, ImageSetEntity imageSet, String description) {
        BoardGameEntity boardGame = new BoardGameEntity();
        boardGame.setBoardgame_name(boardgameName);
        boardGame.setBoardgame_max_player(maxPlayers);
        boardGame.setImageSet(imageSet);
        boardGame.setBoardgame_description(description);
        return boardGameRepository.save(boardGame);
    }

    @Override
    public List<BoardGameEntity> getAllBoardGames() {
        return boardGameRepository.findAll();
    }

    public BoardGameEntity getBoardGameById(int boardgameId) {
        Optional<BoardGameEntity> boardGame = boardGameRepository.findById(boardgameId);
        return boardGame.orElse(null);
    }

    public BoardGameEntity updateBoardGame(int boardgameId, String boardgameName, int maxPlayers, ImageSetEntity imageSet, String description) {
        BoardGameEntity existingBoardGame = getBoardGameById(boardgameId);
        if (existingBoardGame != null) {
            existingBoardGame.setBoardgame_name(boardgameName);
            existingBoardGame.setBoardgame_max_player(maxPlayers);
            existingBoardGame.setImageSet(imageSet);
            existingBoardGame.setBoardgame_description(description);
            return boardGameRepository.save(existingBoardGame);
        }
        return null;
    }

    @Override
    public void deleteBoardGame(int boardgameId) {
        boardGameRepository.deleteById(boardgameId);
    }

    public BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, int lobbyId, byte[] imagesetId, String description) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public BoardGameEntity getBoardGame(int boardgameId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public BoardGameEntity updateBoardGame(int boardgameId, String boardgameName, int maxPlayers, int lobbyId, byte[] imagesetId, String description) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int findFirstAvailableId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

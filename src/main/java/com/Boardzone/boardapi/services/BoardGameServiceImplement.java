/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 *
 * 
 * @author user
 */
@Service
public class BoardGameServiceImplement implements BoardGameService {
    
    private final BoardGameRepository boardGameRepository;
    
    @Autowired
    public BoardGameServiceImplement(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
    }

    @Override
    public BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, long lobbyId, byte[] imagesetId,
                                        String description, Date dateAdded, String rules, String category) {
        BoardGameEntity boardGame = new BoardGameEntity();
        boardGame.setBoardgame_name(boardgameName);
        boardGame.setBoardgame_max_player(maxPlayers);
        boardGame.setLobby_id(lobbyId);
        boardGame.setImageset_id(imagesetId);
        boardGame.setBoardgame_description(description);
        boardGame.setBoardgame_dateAdded(dateAdded);
        boardGame.setBoardgame_rules(rules);
        boardGame.setBoardgame_category(category);
        return boardGameRepository.save(boardGame);
    }

    @Override
    public List<BoardGameEntity> getAllBoardGames() {
        return boardGameRepository.findAll();
    }

    @Override
    public BoardGameEntity getBoardGame(long boardgameId) {
        return boardGameRepository.findById(boardgameId).orElse(null);
    }

    @Override
    public void deleteBoardGame(long boardgameId) {
        boardGameRepository.deleteById(boardgameId);
    }

    @Override
    public BoardGameEntity updateBoardGame(long boardgameId, String boardgameName, int maxPlayers, long lobbyId,
                                           byte[] imagesetId, String description, Date dateAdded,
                                           String rules, String category) {
        BoardGameEntity boardGame = boardGameRepository.findById(boardgameId).orElse(null);
        if (boardGame != null) {
            boardGame.setBoardgame_name(boardgameName);
            boardGame.setBoardgame_max_player(maxPlayers);
            boardGame.setLobby_id(lobbyId);
            boardGame.setImageset_id(imagesetId);
            boardGame.setBoardgame_description(description);
            boardGame.setBoardgame_dateAdded(dateAdded);
            boardGame.setBoardgame_rules(rules);
            boardGame.setBoardgame_category(category);
            return boardGameRepository.save(boardGame);
        }
        return null;
    }
}

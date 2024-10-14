package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardGameServiceImplement implements BoardGameService {
    
    private final BoardGameRepository boardGameRepository;
    
    @Autowired
    public BoardGameServiceImplement(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
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
    public long findFirstAvailableId() {
        List<BoardGameEntity> allBoardGames = boardGameRepository.findAll();
        if (allBoardGames.isEmpty()) {
            return 1;
        }
        long maxId = allBoardGames.stream().mapToLong(BoardGameEntity::getBoardgame_id).max().orElse(0);
        return maxId + 1;
    }

    @Override
    public BoardGameEntity addBoardGame(BoardGameEntity boardgame) {
        boardgame.setBoardgame_id(0);
        return boardGameRepository.save(boardgame);
    }

    @Override
    public BoardGameEntity updateBoardGame(BoardGameEntity boardgame) {
        return boardGameRepository.save(boardgame);
    }

}

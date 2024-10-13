package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.repository.BoardGameRepository;
import jakarta.transaction.Transactional; // Ensure you're using the jakarta package
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardGameServiceImplement implements BoardGameService {

    @Autowired
    private BoardGameRepository boardGameRepository;

    @Override
    @Transactional
    public BoardGameEntity addBoardGame(String boardgameName, int maxPlayers, int lobbyId, byte[] imagesetId, String description) {
        BoardGameEntity boardGame = new BoardGameEntity();
        boardGame.setBoardgame_name(boardgameName);
        boardGame.setBoardgame_max_player(maxPlayers);
        boardGame.setLobby_id(lobbyId); // lobbyId as int
        boardGame.setImageset_id(imagesetId); // Assuming imagesetId is stored as byte[]
        boardGame.setBoardgame_description(description);
        return boardGameRepository.save(boardGame);
    }

    @Override
    @Transactional
    public List<BoardGameEntity> getAllBoardGames() {
        return boardGameRepository.findAll();
    }

    @Override
    @Transactional
    public BoardGameEntity getBoardGame(int boardgameId) { // Use int for ID
        Optional<BoardGameEntity> boardGameOptional = boardGameRepository.findById(boardgameId);
        return boardGameOptional.orElse(null); // Return null if not found
    }

    @Override
    @Transactional
    public void deleteBoardGame(int boardgameId) { // Use int for ID
        boardGameRepository.deleteById(boardgameId);
    }

    @Override
    @Transactional
    public BoardGameEntity updateBoardGame(int boardgameId, String boardgameName, int maxPlayers, int lobbyId, byte[] imagesetId, String description) {
        BoardGameEntity boardGame = getBoardGame(boardgameId);
        if (boardGame != null) {
            boardGame.setBoardgame_name(boardgameName);
            boardGame.setBoardgame_max_player(maxPlayers);
            boardGame.setLobby_id(lobbyId); // lobbyId as int
            boardGame.setImageset_id(imagesetId); // Update imagesetId
            boardGame.setBoardgame_description(description);
            return boardGameRepository.save(boardGame);
        }
        return null; // Return null if not found for updating
    }

    @Override
    public int findFirstAvailableId() {
        // Return the next available ID based on defined logic
        // Here returning count + 1 as a simplistic example
        return (int) boardGameRepository.count() + 1;
    }
}

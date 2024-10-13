package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.services.BoardGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
public class BoardGameController {

    private final BoardGameService boardGameService;

    @Autowired
    public BoardGameController(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    @GetMapping("/viewall")
    public List<BoardGameEntity> getAllBoardGames() {
        return boardGameService.getAllBoardGames();
    }

    @GetMapping("/id/{id}")
    public BoardGameEntity getBoardGameById(@PathVariable long id) {
        BoardGameEntity boardGame = boardGameService.getBoardGame(id);
        if (boardGame == null) {
            throw new RuntimeException("No board game found with ID: " + id);
        }
        return boardGame;
    }

    @PostMapping("/add")
    public BoardGameEntity addBoardGame(@RequestBody BoardGameEntity boardGame) {
        boardGame.setBoardgame_id(0);
        return boardGameService.addBoardGame(
            boardGame.getBoardgame_name(),
            boardGame.getBoardgame_max_player(),
            boardGame.getLobby_id(),
            boardGame.getImageset_id(),
            boardGame.getBoardgame_description()
        );
    }

    @PutMapping("/update/{id}")
    public BoardGameEntity updateBoardGame(@PathVariable long id, @RequestBody BoardGameEntity boardGame) {
        BoardGameEntity updatedBoardGame = boardGameService.updateBoardGame(
            id,
            boardGame.getBoardgame_name(),
            boardGame.getBoardgame_max_player(),
            boardGame.getLobby_id(),
            boardGame.getImageset_id(),
            boardGame.getBoardgame_description()
        );
        if (updatedBoardGame == null) {
            throw new RuntimeException("No board game found with ID: " + id);
        }
        return updatedBoardGame;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBoardGame(@PathVariable long id) {
        BoardGameEntity boardGame = boardGameService.getBoardGame(id);
        if (boardGame == null) {
            throw new RuntimeException("No board game found with ID: " + id);
        }
        boardGameService.deleteBoardGame(id);
        return "Deleted board game with ID: " + id;
    }
}

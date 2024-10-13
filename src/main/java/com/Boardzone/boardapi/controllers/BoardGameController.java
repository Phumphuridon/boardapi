/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.services.BoardGameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for managing board games.
 * Provides endpoints for CRUD operations.
 *
 * @author User
 */
@RestController
@RequestMapping("/api")
public class BoardGameController {
    
    private final BoardGameService boardGameService;
    
    @Autowired
    public BoardGameController(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }
    
    /**
     * Add a new board game to the system.
     * 
     * @param boardGame the board game entity to add
     * @return the added board game
     */
    @PostMapping("/boardgames")
    public ResponseEntity<BoardGameEntity> addBoardGame(@RequestBody BoardGameEntity boardGame) {
        boardGame.setBoardgame_id(0); // Ensure new ID is generated
        BoardGameEntity savedBoardGame = boardGameService.addBoardGame(boardGame.getBoardgame_name(), 
                                                                      boardGame.getBoardgame_max_player(), 
                                                                      boardGame.getLobby_id(), 
                                                                      boardGame.getImageset_id(),
                                                                      boardGame.getBoardgame_description(),
                                                                      boardGame.getBoardgame_dateAdded(),
                                                                      boardGame.getBoardgame_rules(),
                                                                      boardGame.getBoardgame_category());
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBoardGame);
    }
    
    /**
     * Get all board games.
     * 
     * @return list of all board games
     */
    @GetMapping("/boardgames")
    public ResponseEntity<List<BoardGameEntity>> getAllBoardGames() {
        List<BoardGameEntity> boardGames = boardGameService.getAllBoardGames();
        return ResponseEntity.ok(boardGames);
    }
    
    /**
     * Get a board game by its ID.
     * 
     * @param id the ID of the board game
     * @return the board game with the specified ID
     */
    @GetMapping("/boardgames/{id}")
    public ResponseEntity<BoardGameEntity> getBoardGame(@PathVariable long id) {
        BoardGameEntity boardGame = boardGameService.getBoardGame(id);
        if (boardGame == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(null);
        }
        return ResponseEntity.ok(boardGame);
    }
    
    /**
     * Update an existing board game.
     * 
     * @param id the ID of the board game to update
     * @param boardGame the updated board game entity
     * @return the updated board game
     */
    @PutMapping("/boardgames/{id}")
    public ResponseEntity<BoardGameEntity> updateBoardGame(@PathVariable long id, @RequestBody BoardGameEntity boardGame) {
        BoardGameEntity updatedBoardGame = boardGameService.updateBoardGame(id, 
                                                boardGame.getBoardgame_name(), 
                                                boardGame.getBoardgame_max_player(), 
                                                boardGame.getLobby_id(), 
                                                boardGame.getImageset_id(), 
                                                boardGame.getBoardgame_description(),
                                                boardGame.getBoardgame_dateAdded(),
                                                boardGame.getBoardgame_rules(),
                                                boardGame.getBoardgame_category());
        if (updatedBoardGame == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(updatedBoardGame);
    }
    
    /**
     * Delete a board game by its ID.
     * 
     * @param id the ID of the board game to delete
     * @return a confirmation message
     */
    @DeleteMapping("/boardgames/{id}")
    public ResponseEntity<String> deleteBoardGame(@PathVariable long id) {
        BoardGameEntity boardGame = boardGameService.getBoardGame(id);
        if (boardGame == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("No board game found with ID: " + id);
        }
        boardGameService.deleteBoardGame(id);
        return ResponseEntity.ok("Deleted board game with ID: " + id);
    }
    
    /**
     * Global Exception Handler for Internal Server Errors.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("An error occurred: " + ex.getMessage());
    }
}

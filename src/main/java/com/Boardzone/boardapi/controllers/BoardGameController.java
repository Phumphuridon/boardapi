package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import com.Boardzone.boardapi.entity.ImageSetEntity;
import com.Boardzone.boardapi.services.BoardGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
public class BoardGameController {
    @Autowired
    private BoardGameService boardGameService;

    @GetMapping
    public List<BoardGameEntity> getAllBoardGames() {
        return boardGameService.getAllBoardGames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardGameEntity> getBoardGameById(@PathVariable int id) {
        BoardGameEntity boardGame = boardGameService.getBoardGameById(id);
        return boardGame != null ? ResponseEntity.ok(boardGame) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<BoardGameEntity> addBoardGame(
            @RequestParam String boardgameName,
            @RequestParam int maxPlayers,
            @RequestParam ImageSetEntity imageSet,
            @RequestParam String description) {
        BoardGameEntity boardGame = boardGameService.addBoardGame(boardgameName, maxPlayers, imageSet, description);
        return

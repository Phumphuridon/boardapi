package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.LobbyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LobbyRepository extends JpaRepository<LobbyEntity, Integer> {
    // Fetch all lobbies
    List<LobbyEntity> findAll();

}

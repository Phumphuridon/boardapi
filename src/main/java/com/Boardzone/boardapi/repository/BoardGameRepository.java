/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.repository;

import com.Boardzone.boardapi.entity.BoardGameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface BoardGameRepository extends JpaRepository<BoardGameEntity, Long> {
    
}

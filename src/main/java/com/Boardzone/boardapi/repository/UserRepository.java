/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Boardzone.boardapi.entity.User;

/**
 *
 * @author phump
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    @Query("SELECT u.user_id FROM User u WHERE u.user_name = :username")
    Integer getUserIdByUserName(String username);
}
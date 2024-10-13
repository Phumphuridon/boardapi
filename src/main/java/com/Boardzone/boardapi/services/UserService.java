/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.User;
import java.util.List;

/**
 *
 * @author phump
 */
public interface UserService {
    List<User> getAllUsers();
    
    User getUserById(Integer id);
    
    User addUser(User user);
    
    User updateUser(User user);

    void deleteUserById(Integer id);
    
    Integer getUserIdByUserName(String username);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.controllers;

import com.Boardzone.boardapi.entity.User;
import com.Boardzone.boardapi.services.UserService;
import com.Boardzone.boardapi.util.sha256;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author phump
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/viewall")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    @GetMapping("/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
    
    @GetMapping("/username/{username}")
    public Integer getIdByUsername(@PathVariable String username){
        return userService.getUserIdByUserName(username);
    }
    
    @PostMapping("/register")
    public User addUser(@RequestBody User user){
        user.setUser_password(sha256.hash2sha256(user.getUser_password()));
        return userService.addUser(user);
    }
    
    @PostMapping("/login")
    public User loginUser(@RequestBody User user){
        Integer user_id = userService.getUserIdByUserName(user.getUser_name());
        User requestUser = userService.getUserById(user_id);
        if (!user.getUser_name().equals(requestUser.getUser_name())){
            return null;
        }
        if (!sha256.hash2sha256(user.getUser_password()).equals(requestUser.getUser_password())){
            return null;
        }
        return requestUser;
    }
}
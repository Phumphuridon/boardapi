/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.UserDemo;
import com.Boardzone.boardapi.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author phump
 */
@Service
public class UserServiceImplement implements UserDemoService{
    private UserRepository userRepository;
    
    @Autowired
    public UserServiceImplement(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @Override
    public UserDemo save(UserDemo user){
        return userRepository.save(user);
    }

    @Override
    public List<UserDemo> findAll() {
        return userRepository.findAll();
    }
    
    public UserDemo findById(Integer id){
        Optional<UserDemo> result = userRepository.findById(id);
        UserDemo data=null;
        if (result.isPresent()){
            data=result.get();
        } else {
            throw new RuntimeException("Not Found ID"+id);
        }
        return data;
    }
}

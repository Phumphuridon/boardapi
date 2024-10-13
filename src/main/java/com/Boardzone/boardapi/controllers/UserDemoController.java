///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.Boardzone.boardapi.controllers;
//
//import com.Boardzone.boardapi.entity.UserDemo;
//import com.Boardzone.boardapi.services.UserDemoService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author phump
// */
//@RestController
//@RequestMapping("/test")
//public class UserDemoController {
//    
//    private UserDemoService userDemoService;
//    
//    @Autowired
//    public UserDemoController(UserDemoService userDemoService) {
//        this.userDemoService = userDemoService;
//    }
//    
//    @PostMapping("/users")
//    public UserDemo addUser(@RequestBody UserDemo user){
//        user.setId(0);
//        return userDemoService.save(user);
//    }
//    
//    @GetMapping("/users")
//    public List<UserDemo> getAllUsers(){
//        return userDemoService.findAll();
//    }
//    
//    @GetMapping("/users/{id}")
//    public UserDemo getUser(@PathVariable int id){
//        UserDemo myUser = userDemoService.findById(id);
//        if (myUser==null){
//            throw new RuntimeException("No data "+id);
//        } else {
//            return myUser;
//        }
//    }
//
//}

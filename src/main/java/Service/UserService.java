/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.UserEntity;
import Interface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author phump
 */
@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;
    
    public void addUser(String userName, String userPassword, byte[] userProfile){
        UserEntity user = new UserEntity();
        user.setUser_name(userName);
        user.setUser_password(userPassword);
        user.setUser_profile(userProfile);
        userRepository.save(user);
    }
    
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
    
    public UserEntity getUser(long user_id){
        return userRepository.findById(user_id).orElse(null);
    }
}

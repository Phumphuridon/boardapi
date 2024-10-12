/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author phump
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}

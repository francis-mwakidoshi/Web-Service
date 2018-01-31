/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricom.repository;

import com.safaricom.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sly
 */
public interface UserRepository extends JpaRepository <Employee,Long> {
    
    
    
}

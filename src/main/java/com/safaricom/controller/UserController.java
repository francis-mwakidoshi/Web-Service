/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricom.controller;

import com.safaricom.entities.Employee;
import com.safaricom.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sly
 */
@RestController
@RequestMapping("/api")
public class UserController {
    
      @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/employees")
    public List<Employee> getUsers(){
        
        return userRepository.findAll();
        
    }
    
    @GetMapping("/employee/{id}")
    public Employee getUser(@PathVariable Long id){
        
        return userRepository.findOne(id);
        
    }
    
    @DeleteMapping("/employee/{id}")
    public boolean deleteUser(@PathVariable Long id){
        
        userRepository.delete(id);
        return true;
        
    }
    
    @PostMapping("/employee")
    public Employee creatUser(@RequestBody Employee employee){
        
        return userRepository.save(employee);
        
    }
    
    @PutMapping("/employee")
    public Employee updateUser(@RequestBody Employee employee){
        
        return userRepository.save(employee);
        
    }
    
}

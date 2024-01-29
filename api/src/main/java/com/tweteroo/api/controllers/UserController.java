package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.UserDTO;
import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.repositories.UserRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")

public class UserController {    
     
    final UserRepository userRepository;

    UserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @PostMapping()
    public void postUser(@RequestBody @Valid UserDTO body){
        UserModel user = new UserModel(body);  
        userRepository.save(user); 
    }    

}


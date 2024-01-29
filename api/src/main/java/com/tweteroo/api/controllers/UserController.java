package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.repositories.UserRepository;

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
    public void postUser(@RequestBody String body){
        System.out.println("usuário adicionado");
        System.out.println(body);
    }    

}


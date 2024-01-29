package com.tweteroo.api.models;

import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Getters ands Setters
@Data
@NoArgsConstructor
@AllArgsConstructor

//DB
@Entity
@Table(name = "users") 
 
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(nullable = false)
    private String username;
    
    @Column(length = 100, nullable = false)
    private String avatar;   
    
    public void postUser(@RequestBody String username, String avatar){
        this.username = username;
        this.avatar = avatar;
    }

    
}


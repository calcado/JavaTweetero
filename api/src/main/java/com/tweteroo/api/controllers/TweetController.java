package com.tweteroo.api.controllers;

import com.tweteroo.api.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.repositories.TweetRepository;
import com.tweteroo.api.models.TweetModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tweets")
public class TweetController{
    
    final TweetRepository tweetRepository;

    TweetController(TweetRepository tweetRepository){
        this.tweetRepository = tweetRepository;
    }

    @GetMapping
    public List<TweetModel> getTweets(){
        return tweetRepository.findAll();        
        
    }

    @GetMapping("/tweets/users/{id}")
    public String getTweetByUserId(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @PostMapping
    public void postTweet(@RequestBody @Valid TweetDTO body) {
        TweetModel tweet = new TweetModel(body);
        tweetRepository.save(tweet);       
        
    }
    
}

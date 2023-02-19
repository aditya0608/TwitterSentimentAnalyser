package com.aditya.twittersentimentanalyser.controllers;

import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/twitter")
public class TwitterController {

    @GetMapping("/{wordLimit}/{duration}/{durationSpecification}")
    public ResponseEntity<List<String>> getTopTweets(@PathVariable int wordLimit, @PathVariable int duration, @PathVariable String durationSpecification)
    {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @GetMapping("/{words}")
    public ResponseEntity<List<String>> getTopTweets(@PathVariable List<String> words)
    {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @GetMapping
    public ResponseEntity<String> getTweets()
    {
        return new ResponseEntity<>("tweet one",HttpStatus.ACCEPTED);
    }
    @GetMapping("/tweetOne")
    public ResponseEntity<String> getTweet()
    {
        return new ResponseEntity<>("tweet one",HttpStatus.ACCEPTED);
    }
}

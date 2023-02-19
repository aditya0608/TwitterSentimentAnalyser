package com.aditya.twittersentimentanalyser.controllers;

import com.aditya.twittersentimentanalyser.model.SearchKeyWords;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/twitter")
public class TwitterController {

    @GetMapping("/tweets/{wordLimit}/{duration}/{durationSpecification}")
    public ResponseEntity<List<String>> getTopTweets(@PathVariable int wordLimit, @PathVariable int duration, @PathVariable String durationSpecification)
    {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @GetMapping("/tweets/searchKeyWords")
    public ResponseEntity<List<String>> getTopTweets(@RequestBody SearchKeyWords words)
    {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @GetMapping("/tweets/{userId}")
    public ResponseEntity<String> getTweetsByUserId(@PathVariable String userId)
    {
        return new ResponseEntity<>("tweet one",HttpStatus.ACCEPTED);
    }
    @GetMapping("/tweets/")
    public ResponseEntity<String> getTweet(@RequestParam(name="geoCode",required = true) String geoCode)
    {
        return new ResponseEntity<>("tweet one",HttpStatus.ACCEPTED);
    }
}

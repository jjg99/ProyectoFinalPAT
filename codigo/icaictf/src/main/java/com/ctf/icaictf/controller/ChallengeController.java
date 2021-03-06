package com.ctf.icaictf.controller;

import javax.validation.Valid;

import com.ctf.icaictf.config.JwtTokenUtil;
import com.ctf.icaictf.model.Challenge;
import com.ctf.icaictf.service.ChallengeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    @Autowired
    private ChallengeService challengeService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    
    @PostMapping("/new")
    public ResponseEntity<Challenge> createChallenge(@RequestBody @Valid Challenge challenge, @RequestHeader("Authorization") String tokenHeader) {
        String jwtToken = tokenHeader.substring(7);
        challenge.setUsername(jwtTokenUtil.getUsernameFromToken(jwtToken));
        challenge = challengeService.createChallenge(challenge);
        if (challenge!=null){
            return new ResponseEntity<Challenge>(challenge, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/challenge/{id}")
    public ResponseEntity<Object> getChallenge(@PathVariable ("id") Integer id) {
        Challenge challenge = challengeService.getChallengeById(id);
        if (challenge!=null){
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No such challenge",HttpStatus.NOT_FOUND);
        }
    }

    // @GetMapping
    // public ResponseEntity<Object> getChallenges() {
    //     List<Challenge> challenge = challengeService.getChallenges();
    //     if (challenge!=null){
    //         return new ResponseEntity<>(challenge, HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>("No such challenge",HttpStatus.NOT_FOUND);
    //     }
    // }
    
    
}

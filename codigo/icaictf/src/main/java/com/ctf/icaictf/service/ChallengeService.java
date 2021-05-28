package com.ctf.icaictf.service;

import java.util.List;

import com.ctf.icaictf.model.Challenge;

public interface ChallengeService {

    public Challenge createChallenge(Challenge challenge);

    public Challenge getChallengeById(Integer id);

    public List<Challenge> getChallenges();
    
}

package com.ctf.icaictf.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ctf.icaictf.model.Challenge;
import com.ctf.icaictf.repository.ChallengeRepository;
import com.ctf.icaictf.service.ChallengeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService{
    
    @Autowired
    private ChallengeRepository challengeRepository;
    
    @Override
    public Challenge createChallenge(Challenge challenge) {
        try {
            // System.out.println(challenge.getId()+challenge.getDifficulty()+challenge.getUsername()+challenge.getData());
            // System.out.println("***************************************************************************************");
            // challengeRepository.add(challenge.getId(),challenge.getDifficulty(),challenge.getUsername(),challenge.getData());
            return challengeRepository.save(challenge);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Challenge getChallengeById(Integer id) {
        try {
            return challengeRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Challenge> getChallenges() {
        List<Challenge> challenges = new ArrayList<Challenge>();
        for (Challenge challenge : challengeRepository.findAll()) {
            challenges.add(challenge);
        }
        return challenges;
    }
}

package com.ctf.icaictf.service.impl;

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
    public Boolean createChallenge(Challenge challenge) {
        try {
            System.out.println(challenge.getId()+challenge.getDifficulty()+challenge.getUsername()+challenge.getData());
            System.out.println("***************************************************************************************");
            challengeRepository.add(challenge.getId(),challenge.getDifficulty(),challenge.getUsername(),challenge.getData());
            // challengeRepository.save(challenge);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

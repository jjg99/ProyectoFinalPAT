package com.ctf.icaictf.service;

import java.util.List;

import com.ctf.icaictf.model.Score;
import com.ctf.icaictf.model.UserPodio;

public interface PodiumService {
    
    public List<Score> getScoresByUsername(String username);

    public List<Score> getScoresByChallenge(String challenge_id);

    public List<Score> getAllScores();

    public List<UserPodio> getUsersByScores();
}

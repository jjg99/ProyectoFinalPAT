package com.ctf.icaictf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.ctf.icaictf.model.Score;
import com.ctf.icaictf.model.UserPodio;
import com.ctf.icaictf.repository.PodiumRepository;
import com.ctf.icaictf.repository.UserDetailRepository;
import com.ctf.icaictf.service.PodiumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PodiumServiceImpl implements PodiumService {

    @Autowired
    private PodiumRepository podiumRepository;

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public List<Score> getScoresByUsername(String username) {
        
        return podiumRepository.getScoresByUsername(username);
    }

    @Override
    public List<Score> getScoresByChallenge(String challenge_id) {
        
        return podiumRepository.getScoresByChallenge(challenge_id);
    }

    @Override
    public List<Score> getAllScores() {
        List<Score> scores = new ArrayList<Score>();
        for (Score score : podiumRepository.findAll()) {
            scores.add(score);
        }
        return scores;
    }

    @Override
    public List<UserPodio> getUsersByScores() {
        List<Score> scores = getAllScores();
        HashMap<String, Integer> point_list = new HashMap<String, Integer>();

        for (Score score : scores) {
            if(point_list.containsKey(score.getUsername())) {
                Integer points = point_list.get(score.getUsername());
                points = points + score.getPoints();
                point_list.replace(score.getUsername(), points);
            } else {
                point_list.put(score.getUsername(), score.getPoints());
            }
        }
        Map<String, Integer> point_list_ordered = sortByValue(point_list, false);
        List<UserPodio> usersPodio = new ArrayList<UserPodio>();


        for(int i = 0; i< point_list_ordered.size(); i++) {
            UserPodio userPodio = new UserPodio();
            userPodio.setUsername(point_list_ordered.keySet().toArray()[i].toString());
            userPodio.setPosition(i+1);
            userPodio.setPoints(Integer.valueOf(point_list_ordered.values().toArray()[i].toString()));
            userPodio.setCountry_code(userDetailRepository.getUserByUsername(userPodio.getUsername()).getCountry_code());

            usersPodio.add(userPodio);
        }
        
        return usersPodio;
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap, final boolean order)
    {
        List<Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        // Sorting the list based on values
        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> b, LinkedHashMap::new));

    }
    
}

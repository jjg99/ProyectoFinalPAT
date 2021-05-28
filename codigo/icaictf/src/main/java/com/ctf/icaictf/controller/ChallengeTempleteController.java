package com.ctf.icaictf.controller;

import java.util.ArrayList;
import java.util.List;

import com.ctf.icaictf.model.Challenge;
import com.ctf.icaictf.service.ChallengeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ChallengeTempleteController {

    @Autowired
    private ChallengeService challengeService;
    
    @GetMapping("/challenges")
    public String getChallenges(Model model) {
        final List<Challenge> challenges = challengeService.getChallenges();
        model.addAttribute("challenges", challenges);
        return "challenges";
    }

    @GetMapping("/preview/{id}")
    public String getChallenge(Model model, @PathVariable ("id") Integer id) {
        
        final List<Challenge> challenges = new ArrayList<Challenge>();
        challenges.add(challengeService.getChallengeById(id));
        model.addAttribute("challenges", challenges);
        return "challenge_preview";
    }

    @GetMapping("challenge/make/{id}")
    public String makeChalle(Model model, @PathVariable ("id") Integer id) {
        return "make_challenge";
    }

}

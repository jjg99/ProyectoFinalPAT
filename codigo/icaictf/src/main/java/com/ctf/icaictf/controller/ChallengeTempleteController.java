package com.ctf.icaictf.controller;

import java.util.List;

import com.ctf.icaictf.model.Challenge;
import com.ctf.icaictf.service.ChallengeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}

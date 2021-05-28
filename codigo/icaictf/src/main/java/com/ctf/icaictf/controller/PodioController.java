package com.ctf.icaictf.controller;

import java.util.List;

import com.ctf.icaictf.model.UserPodio;
import com.ctf.icaictf.service.PodiumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PodioController {
    
    @Autowired
    PodiumService podiumService;

    @GetMapping("/podio")
    public String podio(Model model){
        
        final List<UserPodio> users = podiumService.getUsersByScores();
		model.addAttribute("users", users);
        return "podio";
        
    }

}

package com.ctf.icaictf.controller;

import java.util.List;

import com.ctf.icaictf.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PodioController {
    
    @GetMapping("podio")
    public String podio(Model model){
        final User user1 = new User();
		user1.setUsername("jjg99");
        user1.setCountry("Estados Unidos de Ámerica");
        user1.setCountry_code("US");
        user1.setPosition(1);
		final User user2 = new User();
		user2.setUsername("J0nan");
        user2.setCountry("Canada");
        user2.setCountry_code("CA");
        user2.setPosition(2);
		final User user3 = new User();
		user3.setUsername("ICAI");
        user3.setCountry("España");
        user3.setCountry_code("ES");
        user3.setPosition(3);
        final List<User> users = List.of(user1, user2, user3);
		model.addAttribute("users", users);
        return "podio";
        
    }

}

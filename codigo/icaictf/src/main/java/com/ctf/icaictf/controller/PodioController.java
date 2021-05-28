package com.ctf.icaictf.controller;

import java.util.List;

import com.ctf.icaictf.model.UserDetail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PodioController {
    
    @GetMapping("/podio")
    public String podio(Model model){
        final UserDetail user1 = new UserDetail();
		user1.setUsername("jjg99");
        user1.setCountry("Estados Unidos de Ámerica");
        user1.setCountry_code("US");
        // user1.setPosition(1);
		final UserDetail user2 = new UserDetail();
		user2.setUsername("J0nan");
        user2.setCountry("Canada");
        user2.setCountry_code("CA");
        // user2.setPosition(2);
		final UserDetail user3 = new UserDetail();
		user3.setUsername("ICAI");
        user3.setCountry("España");
        user3.setCountry_code("ES");
        // user3.setPosition(3);
        final UserDetail user4 = new UserDetail();
		user4.setUsername("Felíx");
        user4.setCountry("Argentina");
        user4.setCountry_code("AR");
        // user4.setPosition(4);
		final UserDetail user5 = new UserDetail();
		user5.setUsername("Diamante");
        user5.setCountry("España");
        user5.setCountry_code("ES");
        // user5.setPosition(5);
		final UserDetail user6 = new UserDetail();
		user6.setUsername("Tom");
        user6.setCountry("Estados Unidos de Ámerica");
        user6.setCountry_code("US");
        // user6.setPosition(6);
        final List<UserDetail> users = List.of(user1, user2, user3, user4, user5, user6);
		model.addAttribute("users", users);
        return "podio";
        
    }

}

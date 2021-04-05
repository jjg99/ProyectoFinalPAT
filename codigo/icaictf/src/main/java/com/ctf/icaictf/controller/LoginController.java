package com.ctf.icaictf.controller;

import com.ctf.icaictf.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class LoginController {
    @PostMapping("login")
    public ResponseEntity<User> login(@RequestBody User user) {
        
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
    @GetMapping("home/{userID}")
    public String login(Model model, @PathVariable String userID){
        
        final User usuario = new User();
        usuario.setUsername(userID);
        usuario.setCountry("España");
        usuario.setCountry_code("ES");
        usuario.setPosition(3);
        model.addAttribute("usuario", usuario);
        return "userbienvenida";
    }

    
}

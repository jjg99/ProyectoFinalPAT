package com.ctf.icaictf.controller;

import javax.validation.Valid;

import com.ctf.icaictf.model.UserDetail;

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
    public ResponseEntity<UserDetail> login(@RequestBody @Valid UserDetail user) {
		return new ResponseEntity<>(user, HttpStatus.OK);
        //devolver 403.html si hay error
        //si va bien return "redirect:/home/"+username;
	}
    @GetMapping("home/{userID}")
    public String login(Model model, @PathVariable String userID){
        
        final UserDetail usuario = new UserDetail();
        usuario.setUsername(userID);
        usuario.setCountry("España");
        usuario.setCountry_code("ES");
        //usuario.setPosition(3);
        model.addAttribute("usuario", usuario);
        return "userbienvenida";
    }

    
}

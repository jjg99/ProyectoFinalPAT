package com.ctf.icaictf.controller;

import com.ctf.icaictf.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @GetMapping("login")
    public String getLogin(Model m){
        final User usuario = new User();
        usuario.setUsername("username");
        return "login";
    }

    
}

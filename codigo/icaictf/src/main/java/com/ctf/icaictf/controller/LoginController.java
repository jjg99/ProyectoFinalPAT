package com.ctf.icaictf.controller;

import javax.validation.Valid;

import com.ctf.icaictf.config.JwtTokenUtil;
import com.ctf.icaictf.model.UserDetail;
import com.ctf.icaictf.repository.UserDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserDetailRepository userDetailRepository;

    @PostMapping("/login")
    public ResponseEntity<UserDetail> login(@RequestBody @Valid UserDetail user) {
		return new ResponseEntity<>(user, HttpStatus.OK);
        //devolver 403.html si hay error
        //si va bien return "redirect:/home/"+username;
	}
    @GetMapping("home/{userID}")
    public String login(Model model, @PathVariable String userID){


        final UserDetail usuario = userDetailRepository.getUserByUsername(userID);
        //final UserDetail usuario = userDetailRepository.findById(jwtTokenUtil.getUsernameFromToken(token)).get();
        //

        model.addAttribute("users", usuario);
        return "userbienvenida";
    }

    
}

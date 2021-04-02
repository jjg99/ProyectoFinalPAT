package com.ctf.icaictf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PodioController {
    
    @GetMapping("podio")
    public String podio(){
        return "podio";
        
    }

}

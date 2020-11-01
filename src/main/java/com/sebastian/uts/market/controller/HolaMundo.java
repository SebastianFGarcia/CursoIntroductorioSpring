package com.sebastian.uts.market.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @RequestMapping("/")
    public String home(){
        return "Hola mundo!";
    }
    
}

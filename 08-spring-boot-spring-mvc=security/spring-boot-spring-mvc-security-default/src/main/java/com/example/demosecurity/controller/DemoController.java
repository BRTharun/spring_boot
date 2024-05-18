package com.example.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/leaders")
    public String leader(){
        return "leader";
    }

    @GetMapping("/system")
    public String system(){
        return "system";
    }
}


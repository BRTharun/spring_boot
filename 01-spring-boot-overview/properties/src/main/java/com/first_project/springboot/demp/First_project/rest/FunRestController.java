package com.first_project.springboot.demp.First_project.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private   String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String coach(){
        return  "CoachName "+coachName+"TeamName "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/fit")
    public String stayFit(){
        return "Go gym everyday";
    }

    @GetMapping("/yoga")
    public String doYoga(){
        return "do yoga to stay fit";
    }

}

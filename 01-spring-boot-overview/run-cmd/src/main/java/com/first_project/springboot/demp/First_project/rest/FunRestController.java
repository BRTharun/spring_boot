package com.first_project.springboot.demp.First_project.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
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

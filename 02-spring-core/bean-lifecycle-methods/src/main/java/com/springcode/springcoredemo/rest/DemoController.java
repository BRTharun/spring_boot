package com.springcode.springcoredemo.rest;

import com.springcode.springcoredemo.comman.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;


    @Autowired
    public DemoController(@Qualifier("aqua") Coach theCoach){
        System.out.println("In Constructor"+getClass().getSimpleName());
        myCoach=theCoach;
    }


    @GetMapping("/getworkout")
    public String getDailyWorkout(){
        return myCoach.getWorkout();
    }
}

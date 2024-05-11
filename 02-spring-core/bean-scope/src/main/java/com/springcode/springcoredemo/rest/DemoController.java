package com.springcode.springcoredemo.rest;

import com.springcode.springcoredemo.comman.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("volleyBallCoach") Coach theCoach,
                          @Qualifier("volleyBallCoach") Coach theAnotherCoach){
        System.out.println("In Constructor"+getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach=theAnotherCoach;
    }
    @GetMapping("/check")
    public String get(){
        return "compairing beans: myCoach==anotherCoach "+(myCoach==anotherCoach);
    }

    @GetMapping("/getworkout")
    public String getDailyWorkout(){
        return myCoach.getWorkout();
    }
}

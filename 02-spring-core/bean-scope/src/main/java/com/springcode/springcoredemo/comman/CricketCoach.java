package com.springcode.springcoredemo.comman;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 15 mins";
    }
}

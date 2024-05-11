package com.springcode.springcoredemo.comman;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 15 mins";
    }
}

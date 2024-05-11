package com.springcode.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 20 mins";
    }
}

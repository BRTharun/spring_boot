package com.springcode.springcoredemo.comman;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements  Coach{


    @Override
    public String getWorkout() {
        return "practice volleyball";
    }
}

package com.springcode.springcoredemo.comman;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements  Coach{
    @Override
    public String getWorkout() {
        return "practice free kick's";
    }
}

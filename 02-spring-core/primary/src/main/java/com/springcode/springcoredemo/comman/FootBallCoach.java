package com.springcode.springcoredemo.comman;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootBallCoach implements  Coach{
    @Override
    public String getWorkout() {
        return "practice free kick's";
    }
}

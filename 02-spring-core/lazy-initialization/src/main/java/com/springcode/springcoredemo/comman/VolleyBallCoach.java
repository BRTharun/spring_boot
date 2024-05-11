package com.springcode.springcoredemo.comman;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class VolleyBallCoach implements  Coach{

    public VolleyBallCoach(){
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "practice volleyball";
    }
}

package com.springcode.springcoredemo.comman;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class FootBallCoach implements  Coach{

    public FootBallCoach(){
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "practice free kick's";
    }
}

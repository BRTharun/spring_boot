package com.springcode.springcoredemo.comman;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class VolleyBallCoach implements  Coach{

    public VolleyBallCoach(){
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "practice volleyball";
    }
}

package com.springcode.springcoredemo.comman;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Swim 100mts for practice";
    }
}

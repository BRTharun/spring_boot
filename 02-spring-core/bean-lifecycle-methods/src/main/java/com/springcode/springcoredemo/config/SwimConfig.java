package com.springcode.springcoredemo.config;

import com.springcode.springcoredemo.comman.Coach;
import com.springcode.springcoredemo.comman.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimConfig {

    @Bean("aqua")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}

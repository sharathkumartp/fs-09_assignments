package com.geekster.weeklytest1;

import component.University;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"component"})
public class CustomConfiguration {

    @Bean
    public Student getStudent(){
        return new Student("Sharath");
    }

    public University about(){
        return new University();
    }
}


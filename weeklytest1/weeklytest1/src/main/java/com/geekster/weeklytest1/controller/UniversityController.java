package com.geekster.weeklytest1.controller;

import component.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    @Autowired
    University u1;

    @GetMapping(value = "/university")
    public String aboutUniversity(){
        return u1.about();
    }
}

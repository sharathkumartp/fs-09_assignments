package com.geekster.weeklytest1.controller;

import com.geekster.weeklytest1.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    Student s1;

    @GetMapping(value = "/student")
    public String getStudent(){

        return s1.toString();
    }
}

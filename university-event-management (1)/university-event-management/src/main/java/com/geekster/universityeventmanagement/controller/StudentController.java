package com.geekster.universityeventmanagement.controller;

import com.geekster.universityeventmanagement.model.Department;

import com.geekster.universityeventmanagement.model.Student;
import com.geekster.universityeventmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping(value = "/updateDepartment/{department}/Id/{}")
    public void updateDepartment(@PathVariable Department department, @PathVariable Integer id ){
        studentService.updateDepartment(department,id);
    }

    @DeleteMapping(value = "/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping(value = "/getAllStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping(value = "/getStudentById/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }


}

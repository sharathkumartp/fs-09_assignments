package com.geekster.DataBaseRelationship.controller;


import com.geekster.DataBaseRelationship.model.Student;
import com.geekster.DataBaseRelationship.service.StudentService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<String> addStudent(@RequestBody Student newStudent){
        int studentId=studentService.saveStudent(newStudent);
        return new ResponseEntity<>("student save with User id- "+studentId , HttpStatus.CREATED);
    }



    @GetMapping(value = "/student")
    public ResponseEntity<String> getStudent(@Nullable @PathVariable Integer studentId){
        JSONArray studentList=studentService.getStudent(studentId);
        return new ResponseEntity<>(studentList.toString(), HttpStatus.OK);
    }

    @PutMapping("/student/{studentId}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer studentId, @RequestBody Student updateStudent){
        studentService.updateStudent(studentId,updateStudent);
        return new ResponseEntity<>("User Updated user id- "+studentId,HttpStatus.OK);
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return "student delete successfully user id -"+studentId;
    }
}

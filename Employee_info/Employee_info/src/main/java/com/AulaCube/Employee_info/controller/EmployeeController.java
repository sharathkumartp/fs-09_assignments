package com.AulaCube.Employee_info.controller;

import com.AulaCube.Employee_info.model.Employee;
import com.AulaCube.Employee_info.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value="/saveEmployee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping(value = "/findEmployee")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.findEmployee(id);
    }

    @PutMapping(value="/updateEmployee")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee employee,@PathVariable Long id){
        String response;
        HttpStatus status;
        try{
            employeeService.updateEmployee(employee,id);
            response="Restaurant updated successfully...!!!!";
            status=HttpStatus.ACCEPTED;
        }catch (Exception e){
            response="Employee with id: "+id+"doesn't exist";
            status=HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<String>(response,status);
    }

    @DeleteMapping(value = "/deleteEmployee")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}

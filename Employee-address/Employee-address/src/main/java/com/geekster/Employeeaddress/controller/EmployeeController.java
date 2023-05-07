package com.geekster.Employeeaddress.controller;

import com.geekster.Employeeaddress.model.Employee;
import com.geekster.Employeeaddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/getEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAll();
    }

    @GetMapping(value = "/getEmployeeById")
    public Employee getById(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @PostMapping(value = "/saveEmployee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @DeleteMapping(value = "/deleteEmployee")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}

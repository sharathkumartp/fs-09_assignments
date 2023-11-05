package com.AulaCube.Employee_info.controller;

import com.AulaCube.Employee_info.model.Department;
import com.AulaCube.Employee_info.model.Employee;
import com.AulaCube.Employee_info.service.DepartmentService;
import com.AulaCube.Employee_info.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;


    @PostMapping(value = "/saveDepartment")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @DeleteMapping(value = "deleteDepartment")
    public void deleteDepartment(@PathVariable String id){
        departmentService.deleteDepartment(id);
    }


}

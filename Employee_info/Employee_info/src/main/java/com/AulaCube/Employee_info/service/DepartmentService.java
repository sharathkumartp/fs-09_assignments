package com.AulaCube.Employee_info.service;

import com.AulaCube.Employee_info.model.Department;
import com.AulaCube.Employee_info.repository.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    IDepartmentRepo departmentRepo;


    public void addDepartment(Department department) {
        departmentRepo.save(department);
    }

    public void deleteDepartment(String id) {
        departmentRepo.deleteDepartmentByById(id);
    }
}

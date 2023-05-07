package com.geekster.Employeeaddress.service;

import com.geekster.Employeeaddress.model.Employee;
import com.geekster.Employeeaddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepo.getEmployeeById(id);
    }

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}

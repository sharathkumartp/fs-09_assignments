package com.AulaCube.Employee_info.service;

import com.AulaCube.Employee_info.model.Employee;
import com.AulaCube.Employee_info.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public Employee findEmployee(Long id) {
        return employeeRepo.findEmployeeById(id);
    }

    public void updateEmployee(Employee newEmployee, Long id) {
        Employee employee=employeeRepo.findEmployeeById(id);
        if(employee!=null){
            employee.setFirstName(newEmployee.getFirstName());
            employee.setLastName(newEmployee.getLastName());
            employee.setEmail(newEmployee.getEmail());
            employee.setDepartmentId(newEmployee.getDepartmentId());
            employeeRepo.save(employee);
        }else{
            throw  new InputMismatchException("Employee with id: "+id+" doesn't exist");
        }
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}

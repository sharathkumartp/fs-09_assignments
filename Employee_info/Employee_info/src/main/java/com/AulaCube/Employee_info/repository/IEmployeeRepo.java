package com.AulaCube.Employee_info.repository;

import com.AulaCube.Employee_info.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Long> {

    Employee findEmployeeById(Long id);
}

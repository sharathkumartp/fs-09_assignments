package com.geekster.Employeeaddress.repository;

import com.geekster.Employeeaddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Long> {

    @Query(value = "select * from employee where id= :id",nativeQuery = true)
    Employee getEmployeeById(Long id);

    @Query(value = "delete from employee where id= :id",nativeQuery = true)
   public void deleteEmployeeById(Long id);
}

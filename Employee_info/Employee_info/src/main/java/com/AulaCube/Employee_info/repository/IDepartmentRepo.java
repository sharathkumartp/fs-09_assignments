package com.AulaCube.Employee_info.repository;

import com.AulaCube.Employee_info.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepo extends JpaRepository<Department,String> {


    @Query(value ="delete department from department_tbl where department_id= : id" )
    void deleteDepartmentByById(String id);


}

package com.geekster.universityeventmanagement.repository;


import com.geekster.universityeventmanagement.model.Department;
import com.geekster.universityeventmanagement.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IStudentDao extends CrudRepository<Student,Integer> {

    public Student save(Student student);

    @Query(value = "update STUDENT set DEPARTMENT = :department where STUDENT_ID = :id", nativeQuery = true)
    public void updateDep(String department, Integer id);

    public void deleteById(Integer id);
    public List<Student> findAll();


}

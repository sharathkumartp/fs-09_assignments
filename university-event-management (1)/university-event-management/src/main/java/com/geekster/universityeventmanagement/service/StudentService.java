package com.geekster.universityeventmanagement.service;

import com.geekster.universityeventmanagement.model.Department;
import com.geekster.universityeventmanagement.model.Student;
import com.geekster.universityeventmanagement.repository.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    IStudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.save(student);

    }

    public void updateDepartment(Department department, Integer id) {
        String enumValue=department.name();
        studentDao.updateDep(enumValue,id);
    }

    public void deleteStudent(Integer id) {
        studentDao.deleteById(id);
    }

    public List<Student> getStudents() {
       return studentDao.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentDao.findById(id).get();
    }

}

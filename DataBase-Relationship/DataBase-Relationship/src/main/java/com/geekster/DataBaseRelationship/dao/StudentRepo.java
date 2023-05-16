package com.geekster.DataBaseRelationship.dao;

import com.geekster.DataBaseRelationship.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}

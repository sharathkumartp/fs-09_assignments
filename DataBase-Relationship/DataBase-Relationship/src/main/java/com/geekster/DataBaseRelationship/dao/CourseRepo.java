package com.geekster.DataBaseRelationship.dao;

import com.geekster.DataBaseRelationship.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}

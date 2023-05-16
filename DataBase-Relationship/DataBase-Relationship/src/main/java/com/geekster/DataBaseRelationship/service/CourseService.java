package com.geekster.DataBaseRelationship.service;

import com.geekster.DataBaseRelationship.dao.CourseRepo;
import com.geekster.DataBaseRelationship.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public Course getCourseById(Integer courseId) {
        return courseRepo.findById(courseId).get();
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course updateCourse(Integer courseId, Course course) {
        Course course1= courseRepo.findById(courseId).get();
        course1.setDuration(course.getDuration());
        course1.setTitle(course.getTitle());
        course1.setStudentList(course.getStudentList());
        course1.setDescription(course.getDescription());
        return courseRepo.save(course1);
    }

    public void deleteCourse(Integer courseId) {
        courseRepo.deleteById(courseId);
    }
}

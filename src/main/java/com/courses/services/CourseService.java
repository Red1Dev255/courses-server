package com.courses.services;

import com.courses.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.courses.repositories.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

     public List<Course> getAllCourses() {
         return courseRepository.findAll();
     }

    public Course insertCourse(Course course) {
         return courseRepository.save(course);
    }
}

package com.courses.controllers;

import com.courses.courses.Course;
import com.courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

     @GetMapping("/courses/")
     public List<Course> getAllCourses() {
         return courseService.getAllCourses();
     }

    @GetMapping("/ajouter/")
    public Course addCourse() {
        Course course = Course.builder().
                id("1").
                courseName("Java").
                listCourse(List.of("Java", "Spring", "MongoDB")).
                build();
        return courseService.insertCourse(course);
    }
}

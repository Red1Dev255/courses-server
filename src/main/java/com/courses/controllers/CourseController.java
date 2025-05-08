package com.courses.controllers;

import com.courses.courses.Course;
import com.courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String verif() {
        return "hello";
    }

    @GetMapping("/course")
    public Optional<Course> findById(@RequestParam("id")  UUID id) {
        return courseService.getCourseById(id);
    }

     @GetMapping("/courses")
     public List<Course> getAllCourses() {
        return courseService.getAllCourses();
     }

    @GetMapping("/ajouter")
    public Course addCourse() {
        Course course = Course.builder().
                id(UUID.randomUUID()).
                courseName("Java").
                listCourse(List.of("Java", "Spring", "MongoDB")).
                build();
        return courseService.insertCourse(course);
    }

    @GetMapping("/delete")
    public String deleteCourse(@RequestParam("id")  UUID id) {
        return courseService.deleteById(id);
    }

    @GetMapping("/deleteall")
    public String deleteCourse() {
        return courseService.deleteAll();
    }
}

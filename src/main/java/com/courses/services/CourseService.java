package com.courses.services;

import com.courses.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.courses.repositories.CourseRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
         return courseRepository.findAll();
     }

    public Optional<Course> getCourseById(UUID id){ return courseRepository.findById(id);}

    public Course insertCourse(Course course) {
         return courseRepository.save(course);
    }

    public String deleteById(UUID id){
        courseRepository.deleteById(id);
        return "id " + id + " has been deleted" ;
    }

    public String deleteAll(){
        courseRepository.deleteAll();
        return "All information are deleted";
    }
}

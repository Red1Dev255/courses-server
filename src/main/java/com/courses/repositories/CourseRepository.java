package com.courses.repositories;


import com.courses.courses.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface CourseRepository extends MongoRepository<Course, UUID> {
}

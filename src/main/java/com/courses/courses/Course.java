package com.courses.courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Data
@Document(collection = "courses")
public class Course {
    @Id
    private UUID id;
    private String courseName;
    private List<String> listCourse;

}

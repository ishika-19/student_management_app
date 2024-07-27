package com.example.studentmanagementapp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseDTO {

    private int courseid;
    private String coursename;
    private String syllabus;
    private String duration;
}
package com.example.studentmanagementapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseUpdateDTO {

    private int courseid;
    private String coursename;
    private String syllabus;
    private String duration;
}
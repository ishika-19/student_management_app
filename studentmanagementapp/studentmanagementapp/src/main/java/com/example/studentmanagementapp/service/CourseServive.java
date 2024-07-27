package com.example.studentmanagementapp.service;

import com.example.studentmanagementapp.dto.CourseDTO;
import com.example.studentmanagementapp.dto.CourseSaveDTO;
import com.example.studentmanagementapp.dto.CourseUpdateDTO;

import java.util.List;

public interface CourseServive {
    String addCourse(CourseSaveDTO courseSaveDTO);

    List<CourseDTO> getAllCourses();

    String updateCourse(CourseUpdateDTO courseUpdateDTO);

    boolean deleteCourse(int id);
}

package com.example.studentmanagementapp.controller;

import com.example.studentmanagementapp.dto.*;
import com.example.studentmanagementapp.service.CourseServive;
import com.example.studentmanagementapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/course")

public class CourseController {

    @Autowired
    private CourseServive courseServive;

    @PostMapping(path = "/save")
    public String saveCourse(@RequestBody CourseSaveDTO courseSaveDTO){

        String course = courseServive.addCourse(courseSaveDTO);
        return course;
    }

    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllCourses()
    {
        List<CourseDTO> allCourses = courseServive.getAllCourses();
        return allCourses;
    }

    @PutMapping(path = "/update")
    public String updateCourse(@RequestBody CourseUpdateDTO courseUpdateDTO){

        String course = courseServive.updateCourse(courseUpdateDTO);
        return course;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteCourse(@PathVariable(value = "id") int id){

        boolean deleteCourse = courseServive.deleteCourse(id);
        return "deleted!!";
    }
}

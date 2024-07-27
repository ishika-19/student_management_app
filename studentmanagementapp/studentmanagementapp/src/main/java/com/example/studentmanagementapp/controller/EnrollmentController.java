package com.example.studentmanagementapp.controller;

import com.example.studentmanagementapp.dto.*;
import com.example.studentmanagementapp.service.BatchService;
import com.example.studentmanagementapp.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping(path = "/save")
    public String saveEnrollment(@RequestBody EnrollmentSaveDTO enrollmentSaveDTO){

        String enrollment = enrollmentService.addEnrollment(enrollmentSaveDTO);
        return "enrollment added";
    }

    @GetMapping("/getAllEnrollments")
    public List<EnrollmentDTO> getAllEnrollments()
    {
        List<EnrollmentDTO> allEnrollments = enrollmentService.getAllEnrollments();
        return allEnrollments;
    }

    @PutMapping(path = "/update")
    public String updateEnrollment(@RequestBody EnrollmentUpdateDTO enrollmentUpdateDTO){

        String enrollment = enrollmentService.updateEnrollment(enrollmentUpdateDTO);
        return enrollment;
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteEnrollment(@PathVariable(value = "id") int id){

        boolean deleteCourse = enrollmentService.deleteEnrollment(id);
        return "deleted!!";
    }
}

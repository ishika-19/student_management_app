package com.example.studentmanagementapp.service;

import com.example.studentmanagementapp.dto.EnrollmentDTO;
import com.example.studentmanagementapp.dto.EnrollmentSaveDTO;
import com.example.studentmanagementapp.dto.EnrollmentUpdateDTO;

import java.util.List;

public interface EnrollmentService {
    String addEnrollment(EnrollmentSaveDTO enrollmentSaveDTO);

    List<EnrollmentDTO> getAllEnrollments();

    String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO);

    boolean deleteEnrollment(int id);
}

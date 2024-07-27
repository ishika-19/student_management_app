package com.example.studentmanagementapp.service;

import com.example.studentmanagementapp.dto.StudentDTO;
import com.example.studentmanagementapp.dto.StudentSaveDTO;
import com.example.studentmanagementapp.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudents();

    String updateStudent(StudentUpdateDTO studentUpdateDTO);

    boolean deleteStudent(int id);
}

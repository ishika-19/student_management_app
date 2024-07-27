package com.example.studentmanagementapp.service;

import com.example.studentmanagementapp.dto.TeacherDTO;
import com.example.studentmanagementapp.dto.TeacherSaveDTO;
import com.example.studentmanagementapp.dto.TeacherUpdateDTO;

import java.util.List;

public interface TeacherService {
    String addTeacher(TeacherSaveDTO teacherSaveDTO);

    List<TeacherDTO> getAllTeachers();

    String updateTeacher(TeacherUpdateDTO teacherUpdateDTO);

    boolean deleteTeacher(int id);
}

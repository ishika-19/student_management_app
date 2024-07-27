package com.example.studentmanagementapp.repo;

import com.example.studentmanagementapp.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}

package com.example.studentmanagementapp.repo;

import com.example.studentmanagementapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}

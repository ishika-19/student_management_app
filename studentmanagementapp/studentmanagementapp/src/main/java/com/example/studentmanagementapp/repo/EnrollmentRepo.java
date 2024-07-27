package com.example.studentmanagementapp.repo;

import com.example.studentmanagementapp.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepo extends JpaRepository<Enrollment, Integer> {
}

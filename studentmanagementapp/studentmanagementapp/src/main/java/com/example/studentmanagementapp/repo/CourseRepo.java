package com.example.studentmanagementapp.repo;

import com.example.studentmanagementapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}

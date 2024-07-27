package com.example.studentmanagementapp.repo;

import com.example.studentmanagementapp.entity.Batch;
import com.example.studentmanagementapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepo  extends JpaRepository<Batch,Integer> {
}

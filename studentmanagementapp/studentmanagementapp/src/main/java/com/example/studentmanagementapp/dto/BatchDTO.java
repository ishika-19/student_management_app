package com.example.studentmanagementapp.dto;

import com.example.studentmanagementapp.entity.Course;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BatchDTO {

    private int batchid;
    private String batchname;
    private Course course;
    private String startdate;
}

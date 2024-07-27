package com.example.studentmanagementapp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherDTO {

    private int teacherid;
    private String teachername;
    private String address;
    private String phone;
}

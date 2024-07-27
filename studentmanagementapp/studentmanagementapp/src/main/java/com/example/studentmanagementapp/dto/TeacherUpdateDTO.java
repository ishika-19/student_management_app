package com.example.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherUpdateDTO {

    private int teacherid;
    private String teachername;
    private String address;
    private String phone;
}

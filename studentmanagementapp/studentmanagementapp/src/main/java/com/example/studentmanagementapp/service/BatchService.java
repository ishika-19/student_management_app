package com.example.studentmanagementapp.service;

import com.example.studentmanagementapp.dto.BatchDTO;
import com.example.studentmanagementapp.dto.BatchSaveDTO;
import com.example.studentmanagementapp.dto.BatchUpdateDTO;
import com.example.studentmanagementapp.dto.CourseDTO;

import java.util.List;

public interface BatchService {
    String addBatch(BatchSaveDTO batchSaveDTO);


    List<BatchDTO> getAllBatches();

    String updateBatch(BatchUpdateDTO batchUpdateDTO);

    boolean deleteBatch(int id);
}

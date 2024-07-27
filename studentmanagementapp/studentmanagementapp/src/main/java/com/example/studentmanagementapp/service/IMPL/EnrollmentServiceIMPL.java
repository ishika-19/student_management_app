package com.example.studentmanagementapp.service.IMPL;

import com.example.studentmanagementapp.dto.BatchDTO;
import com.example.studentmanagementapp.dto.EnrollmentDTO;
import com.example.studentmanagementapp.dto.EnrollmentSaveDTO;
import com.example.studentmanagementapp.dto.EnrollmentUpdateDTO;
import com.example.studentmanagementapp.entity.Batch;
import com.example.studentmanagementapp.entity.Enrollment;
import com.example.studentmanagementapp.repo.BatchRepo;
import com.example.studentmanagementapp.repo.EnrollmentRepo;
import com.example.studentmanagementapp.repo.StudentRepo;
import com.example.studentmanagementapp.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnrollmentServiceIMPL implements EnrollmentService {

    @Autowired
    private EnrollmentRepo enrollmentRepo;

    @Autowired
    private StudentRepo studentRepo ;

    @Autowired
    private BatchRepo batchRepo;


    @Override
    public String addEnrollment(EnrollmentSaveDTO enrollmentSaveDTO) {

        Enrollment enrollment = new Enrollment(
                studentRepo.getById(enrollmentSaveDTO.getStudent_id()),
                batchRepo.getById(enrollmentSaveDTO.getBatch_id()),
                enrollmentSaveDTO.getJoindate(),
                enrollmentSaveDTO.getFee()

        );

        enrollmentRepo.save(enrollment);
        return enrollment.getJoindate();
    }

    @Override
    public List<EnrollmentDTO> getAllEnrollments() {

        List<Enrollment> getEnrollments = enrollmentRepo.findAll();
        List<EnrollmentDTO> enrollmentDTOList = new ArrayList<>();

        for (Enrollment enrollment:getEnrollments){
            EnrollmentDTO enrollmentDTO = new EnrollmentDTO(
                    enrollment.getEnroll_id(),
                    enrollment.getStudent(),
                    enrollment.getBatch(),
                    enrollment.getJoindate(),
                    enrollment.getFee()
            );
            enrollmentDTOList.add(enrollmentDTO);
        }
        return enrollmentDTOList;
    }

    @Override
    public String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO) {

        if (enrollmentRepo.existsById(enrollmentUpdateDTO.getEnrollid()))
        {
            Enrollment enrollment = enrollmentRepo.getById(enrollmentUpdateDTO.getEnrollid());
            enrollment.setStudent(studentRepo.getById(enrollmentUpdateDTO.getStudent_id()));
            enrollment.setBatch(batchRepo.getReferenceById(enrollmentUpdateDTO.getBatch_id()));
            enrollment.setJoindate(enrollmentUpdateDTO.getJoindate());
            enrollment.setFee(enrollmentUpdateDTO.getFee());
            enrollmentRepo.save(enrollment);
            return enrollment.getJoindate();
        }
        else
        {
            System.out.println("Enrollment ID  Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteEnrollment(int id) {
        if (enrollmentRepo.existsById(id))
        {
            enrollmentRepo.deleteById(id);
        }
        else
        {
            System.out.println("Enrollment ID  Not Found");
        }
        return false;
    }
}

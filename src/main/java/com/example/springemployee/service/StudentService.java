package com.example.springemployee.service;

import com.example.springemployee.DTO.StudentDto;
import com.example.springemployee.DTO.TeacherDto;
import com.example.springemployee.model.Student;
import com.example.springemployee.model.Teacher;
import com.example.springemployee.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public List<Student> findAllStudents(){
        List<Student> studentList = studentRepo.findAll();
        return studentList;
    }

    public void saveStudent(StudentDto student) {
        Student student1 = new Student();
        student1.setStudent_tc(student.getStudent_tc());
        student1.setStudent_name(student.getStudent_name());
        student1.setStudent_surname(student.getStudent_surname());
        student1.setStudent_email(student.getStudent_email());
        student1.setStudent_phone(student.getStudent_phone());
        student1.setStudent_gender(student.getStudent_gender());
        student1.setStudent_address(student.getStudent_address());
        student1.setStudent_bhirtday(student.getStudent_bhirtday());
        studentRepo.save(student1);
    }

    public Integer getStudentsCount() {
        return studentRepo.countStudents();
    }
}

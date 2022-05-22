package com.example.springemployee.service;

import com.example.springemployee.DTO.TeacherDto;
import com.example.springemployee.model.Teacher;
import com.example.springemployee.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeacherService {
    private final TeacherRepo teacherRepo;

    @Autowired
    public TeacherService(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public List<Teacher> findAllTeachers(){

        List<Teacher> teacherList = teacherRepo.findAll();

        return teacherList;
    }

    public void saveTeacher(TeacherDto teacher) {
//        Teacher
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherId(teacher.getTeacherId());
        teacher1.setTeacherAdress(teacher.getAddress());
        teacher1.setTeacherTc(teacher.getTc());
        teacher1.setTeacherBirtday(teacher.getBirthday());
        teacher1.setTeacherGender(teacher.getGender());
        teacher1.setTeacherName(teacher.getFirstName());
        teacher1.setTeacherSurname(teacher.getLastName());
        teacher1.setTeacherEmail(teacher.getEmail());
        teacher1.setTeacherPhone(teacher.getPhone());
        teacher1.setTeacherDepartmant(teacher.getDepartment());
        teacher1.setTeacherBranch(teacher.getBranch());
        teacher1.setTeacherLesson(teacher.getLesson());
        teacherRepo.save(teacher1);
    }

    public Integer getTeachersCount() {
        return teacherRepo.countTeachers();
    }
}

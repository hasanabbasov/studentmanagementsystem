package com.example.springemployee.resource;

import com.example.springemployee.DTO.TeacherDto;
import com.example.springemployee.model.Teacher;
import com.example.springemployee.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherResource {

    public final TeacherService teacherService;


    public TeacherResource(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        try{
            return new ResponseEntity<>(teacherService.findAllTeachers(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/count")
    public ResponseEntity<Integer> getTeachersCount() {
        try{
            return new ResponseEntity<>(teacherService.getTeachersCount(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/create")
    public void saveTeacher(@RequestBody TeacherDto teacher){
        teacherService.saveTeacher(teacher);
    }
}

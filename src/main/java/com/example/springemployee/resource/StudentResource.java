package com.example.springemployee.resource;

import com.example.springemployee.DTO.StudentDto;
import com.example.springemployee.DTO.TeacherDto;
import com.example.springemployee.model.Student;
import com.example.springemployee.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResource {
    public final StudentService studentService;

    public StudentResource(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        try{
            return new ResponseEntity<>(studentService.findAllStudents(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/count")
    public ResponseEntity<Integer> getStudentsCount() {
        try{
            return new ResponseEntity<>(studentService.getStudentsCount(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/create")
    public void saveStudent(@RequestBody StudentDto student){
        studentService.saveStudent(student);
    }
}

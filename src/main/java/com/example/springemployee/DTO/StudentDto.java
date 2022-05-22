package com.example.springemployee.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
    private int student_id;
    private int student_tc;
    private String student_name;
    private String student_surname;
    private String student_email;
    private int student_phone;
    private String student_gender;
    private Date student_bhirtday;
    private String student_address;
    private String student_grade;
    private String student_lesson;
}

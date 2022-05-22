package com.example.springemployee.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class TeacherDto {
    private int teacherId;
    private int tc;
    private Date birthday;
    private String gender;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int phone;
    private String department;
    private String branch;
    private String lesson;
}

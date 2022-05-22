package com.example.springemployee.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@ToString
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
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

    public Student() {

    }
}


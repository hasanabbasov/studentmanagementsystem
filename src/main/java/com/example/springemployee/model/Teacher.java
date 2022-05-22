package com.example.springemployee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@ToString
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;

    @Column
    private int teacherTc;
    @Column
    private String teacherName;
    @Column
    private String teacherSurname;
    @Column
    private String teacherEmail;
    @Column
    private int teacherPhone;
    @Column
    private String teacherGender;
    @Column
    private String teacherBranch;
    @Column
    private String teacherAdress;
    @Column
    private String teacherDepartmant;
    @Column
    private String teacherLesson;
    @Column
    private Date teacherBirtday;


    public Teacher() {

    }

}

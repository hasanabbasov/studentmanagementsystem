package com.example.springemployee.repository;

import com.example.springemployee.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query(value = "select count(*) from student",nativeQuery = true)
    Integer countStudents();
}

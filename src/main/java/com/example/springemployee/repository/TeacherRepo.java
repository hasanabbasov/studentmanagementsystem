package com.example.springemployee.repository;

import com.example.springemployee.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

//    Optional<Teacher> findTeacherByAddress(String address);
   @Query(value = "select count(*) from teacher",nativeQuery = true)
   Integer countTeachers();
}

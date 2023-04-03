package com.example.studentmanagement.dao;

import com.example.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

    public List<Student> findAllByOrderByLastNameAsc();

}
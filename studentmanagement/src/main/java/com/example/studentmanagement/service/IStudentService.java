package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(int theId);

    void save(Student theStudent);

    void deleteById(int theId);

}
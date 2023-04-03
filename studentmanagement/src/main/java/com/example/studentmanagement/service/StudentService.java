package com.example.studentmanagement.service;

import com.example.studentmanagement.dao.IStudentRepository;
import com.example.studentmanagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private IStudentRepository studentRepository;

    @Autowired
    public StudentService(IStudentRepository theStudentRepository) {
       studentRepository = theStudentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);

        Student theStudent = null;

        if (result.isPresent()) {
            theStudent = result.get();
        }
        else {
            throw new RuntimeException("Did not find student id: " + theId);
        }

        return theStudent;
    }

    @Override
    public void save(Student theStudent) {
        studentRepository.save(theStudent);
    }

    @Override
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }

}







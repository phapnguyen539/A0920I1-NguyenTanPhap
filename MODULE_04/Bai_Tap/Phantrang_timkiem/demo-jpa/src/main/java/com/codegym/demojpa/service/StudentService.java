package com.codegym.demojpa.service;

import com.codegym.demojpa.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Page<Student> findAllStudent(Pageable pageable);
    Student findStudentById(int id);
    void saveStudent(Student student);
    void deleteStudentById(int id);
    Page<Student> findStudentByName(String name, Pageable pageable);
}

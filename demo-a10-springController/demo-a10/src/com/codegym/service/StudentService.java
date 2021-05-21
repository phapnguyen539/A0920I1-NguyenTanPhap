package com.codegym.service;

import com.codegym.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    void deleteById(int id);
    void save(Student student);
}

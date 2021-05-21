package com.codegym.repository;

import com.codegym.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(int id);
    void deleteById(int id);
    void save(Student student);
}

package com.codegym.demojpa.service;

import com.codegym.demojpa.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    Student findStudentById(int id);
    void saveStudent(Student student);
    void deleteStudentById(int id);
    List<Student> findStudentByName(String name);
}

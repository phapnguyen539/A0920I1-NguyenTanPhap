package service;

import model.Student;

import java.util.List;

public interface StudentService {

    Student getStudentById(String id);

    List<Student> getAll();

    void saveStudent(Student student);
}


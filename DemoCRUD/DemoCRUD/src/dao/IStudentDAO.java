package dao;

import model.Student;

import java.util.List;

public interface IStudentDAO {
    void insertStudent(Student student);
    Student getStudent(int id);
    List<Student> getAllStudent();
    void updateStudent(Student student);
    void deleteStudent(int id);
}

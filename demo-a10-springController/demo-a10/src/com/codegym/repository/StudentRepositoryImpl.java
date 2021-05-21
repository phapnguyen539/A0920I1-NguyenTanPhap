package com.codegym.repository;

import com.codegym.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Integer, Student> listStudent;

    static {
        listStudent = new HashMap<>();
        listStudent.put(1, new Student(1, "Cong Tu", 26));
        listStudent.put(2, new Student(2, "Viet Tan", 23));
        listStudent.put(3, new Student(3, "Tan Viet", 24));
        listStudent.put(4, new Student(4, "Huu Long", 24));
    }


    @Override
    public List<Student> findAll() {
        return new ArrayList<>(listStudent.values());
    }

    @Override
    public Student findById(int id) {
        return listStudent.get(id);
    }

    @Override
    public void deleteById(int id) {
        listStudent.remove(id);
    }

    @Override
    public void save(Student student) {
        listStudent.put(student.getId(), student);
    }
}

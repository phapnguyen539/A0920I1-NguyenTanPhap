package service;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private static Map<String,Student> studentMap;
    public StudentServiceImpl(){
        if (studentMap!=null){
            return;
        }
        studentMap= new HashMap<>();
        studentMap.put("1", new Student("1","Hoàng",20,"Quảng Nam"));
        studentMap.put("2", new Student("2","Việt",22,"Đà Nẵng"));
        studentMap.put("3",new Student("3","Tân",25,"Huế"));
        studentMap.put("4",new Student("4","Tiến",27,"Sài Gòn"));
        studentMap.put("5",new Student("5","Tú",29,"Quảng Trị"));
    }
    @Override
    public Student getStudentById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void saveStudent(Student student) {
        studentMap.put(student.getId(),student);


    }
}

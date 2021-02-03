package comparable_comparato;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String Name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        Name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName()) ;
    }

    public static void main(String[] args) {
        Student student= new Student("B",20,"QN");
        Student student1= new Student("A",21,"ĐN");
        Student student2= new Student("D",22,"SG");
        Student student3=new Student("C",19,"Huế");

        List<Student> list= new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student std: list
             ) {
            System.out.println(std.toString());
            
        }


    }
}


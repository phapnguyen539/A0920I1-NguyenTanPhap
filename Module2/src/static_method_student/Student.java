package static_method_student;

import java.util.Scanner;

public class Student {
    private int rollno;
    private String name;
    private static String college="Dit";

    public Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college="Codegym";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1= new Student(111,"Hoàng");
        Student s2=new Student(222,"Khánh");
        Student s3= new Student(333,"Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}

package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.StudentService;
import com.codegym.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public ModelAndView getStudentList(){
        return new ModelAndView("student/list", "students", studentService.findAll());
    }

    @GetMapping("/create")
    public String createStudent(){
        return "student/create";
    }

    @PostMapping("/create")
    public String saveStudent(@RequestParam int id,
                              @RequestParam String name, @RequestParam int age){
        Student student = new Student(id, name, age);
        studentService.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteById(id);
        return "redirect:/";
    }

}
